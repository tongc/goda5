package com.goda5.hagendaz.common;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.goda5.hagendaz.common.domain.twopc.Coordinator;
import com.goda5.hagendaz.common.domain.twopc.Operation;
import com.goda5.hagendaz.common.domain.twopc.Participant;
import com.goda5.hagendaz.common.domain.twopc.Transaction;
import com.goda5.hagendaz.common.domain.twopc.TransactionStatus;

public class TwoPhaseCommitTest {
	
	private static final Integer TRANSACTION_ID = 111222333;
	private static final Integer TRANSACTION_ID_1 = 111222335;

	@Test
	public void testLaunch() throws InterruptedException {		
		Thread.sleep(10000);
		
		ExecutorService e = Executors.newFixedThreadPool(3);
				
		final Transaction t = new Transaction(TRANSACTION_ID);
		final Transaction t1 = new Transaction(TRANSACTION_ID_1);
		
		final Participant p1 = new Participant();
		final Participant p2 = new Participant();
		final Participant p3 = new Participant();
		
		p1.addTransaction(t);
		p2.addTransaction(t);
		p3.addTransaction(t);
		
		p1.addTransaction(t1);
		p2.addTransaction(t1);
		p3.addTransaction(t1);
		
		Assert.assertEquals(p1.getTransactionStatus(t), TransactionStatus.READY);
		Assert.assertEquals(p2.getTransactionStatus(t), TransactionStatus.READY);
		Assert.assertEquals(p3.getTransactionStatus(t), TransactionStatus.READY);
		
		Assert.assertEquals(p1.getTransactionStatus(t1), TransactionStatus.READY);
		Assert.assertEquals(p2.getTransactionStatus(t1), TransactionStatus.READY);
		Assert.assertEquals(p3.getTransactionStatus(t1), TransactionStatus.READY);
		
		final Operation o1 = new Operation(2000);
		final Operation o2 = new Operation(3000);
		final Operation o3 = new Operation(5000);
		
		final Operation o11 = new Operation(2000);
		final Operation o22 = new Operation(2000);
		final Operation o33 = new Operation(3000);
		
		Callable<Object> c1 = new Callable<Object>() {
			@Override
			public Object call() throws Exception {
				p1.run(t, o1);
				return null;
			}
		};
		
		Callable<Object> c2 = new Callable<Object>() {
			@Override
			public Object call() throws Exception {
				p2.run(t, o2);
				return null;
			}
		};
		
		Callable<Object> c3 = new Callable<Object>() {
			@Override
			public Object call() throws Exception {
				p3.run(t, o3);
				return null;
			}
		};
		
		Callable<Object> c11 = new Callable<Object>() {
			@Override
			public Object call() throws Exception {
				p1.run(t1, o11);
				return null;
			}
		};
		
		Callable<Object> c22 = new Callable<Object>() {
			@Override
			public Object call() throws Exception {
				p2.run(t1, o22);
				return null;
			}
		};
		
		Callable<Object> c33 = new Callable<Object>() {
			@Override
			public Object call() throws Exception {
				p3.run(t1, o33);
				return null;
			}
		};
		
		e.submit(c1);
		e.submit(c2);
		e.submit(c3);
		
		e.submit(c11);
		e.submit(c22);
		e.submit(c33);
		
		Coordinator c = new Coordinator(t, p1,p2,p3);
		Coordinator co1 = new Coordinator(t1, p1,p2,p3);
		
		c.start();
		while(!c.isCompleted()) {
			Thread.sleep(100);
			Assert.assertEquals(p1.getTransactionStatus(t), TransactionStatus.STARTED);
			Assert.assertEquals(p2.getTransactionStatus(t), TransactionStatus.STARTED);
			Assert.assertEquals(p3.getTransactionStatus(t), TransactionStatus.STARTED);
		}
		
		System.out.println(p1.getTransactionStatus(t));
		System.out.println(p2.getTransactionStatus(t));
		System.out.println(p3.getTransactionStatus(t));
		
		co1.start();
		while(!co1.isCompleted()) {
			Thread.sleep(100);
			Assert.assertEquals(p1.getTransactionStatus(t1), TransactionStatus.STARTED);
			Assert.assertEquals(p2.getTransactionStatus(t1), TransactionStatus.STARTED);
			Assert.assertEquals(p3.getTransactionStatus(t1), TransactionStatus.STARTED);
		}
		
		System.out.println(p1.getTransactionStatus(t1));
		System.out.println(p2.getTransactionStatus(t1));
		System.out.println(p3.getTransactionStatus(t1));
		
		
		Thread.sleep(300000);
	}
}
