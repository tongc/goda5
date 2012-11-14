package com.goda5.hagendaz.common.domain.twopc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.math.RandomUtils;

public class Participant {
	private Map<Transaction, TransactionStatus> transactionStatus = new HashMap<Transaction, TransactionStatus>();
	private Map<Transaction, List<Participant>> participants = new HashMap<Transaction, List<Participant>>();

	public Object getTransactionStatus(Transaction t) {
		return transactionStatus.get(t);
	}
	
	public boolean readyToCommit(Transaction t) throws InterruptedException {
		while(transactionStatus.get(t) == TransactionStatus.STARTED) {
			Thread.sleep(500);
		}
		if(transactionStatus.get(t)==TransactionStatus.COMPLETED) {
			return true;
		} else {
			return false;
		}
	}

	public void commit(Transaction t) {
		transactionStatus.put(t, TransactionStatus.COMMITTED);
	}

	public void abort(Transaction t) {
		transactionStatus.put(t, TransactionStatus.ABORTED);
	}

	public void addTransaction(Transaction t) {
		transactionStatus.put(t, TransactionStatus.READY);
	}

	public void run(Transaction t, Operation o) throws InterruptedException {
		transactionStatus.put(t, TransactionStatus.STARTED);
		Thread.sleep(o.getMiliSeconds());
		if(RandomUtils.nextBoolean()) {
			System.out.println(Thread.currentThread().getName() + " on Transaction " + t.getTransactionId() + " Completed");
			transactionStatus.put(t, TransactionStatus.COMPLETED);
		} else {
			System.out.println(Thread.currentThread().getName() + " on Transaction " + t.getTransactionId() + " Aborted");
			transactionStatus.put(t, TransactionStatus.ABORTED);
		}
	}

	public void setParticipants(Transaction t, List<Participant> participants) {
		this.participants.put(t, participants);
	}
}
