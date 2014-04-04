package com.goda5.hagendaz.common.util;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

import edu.emory.mathcs.backport.java.util.concurrent.locks.ReentrantReadWriteLock;

public class ThreadTest {
	static int b = 0;
	static AtomicInteger c = new AtomicInteger(0);
	static volatile int a = 0;
	static int d = 0;
	static int e = 0;
	static int ff = 0;
	static int gg = 0;
	static int hh = 0;
	static ReentrantLock l = new ReentrantLock();
	ReentrantLock l2 = new ReentrantLock();
	static ReentrantReadWriteLock rlock = new ReentrantReadWriteLock();
	
	class A implements Callable<String> {
		@Override
		public String call() throws Exception {
			return new Long(System.currentTimeMillis()).toString();
		}
	}
	
	class B implements Runnable {
		@Override
		public void run() {
			a++;
			b++;
			c.incrementAndGet();
			l.lock();
			d++;
			l.unlock();
			synchronized(ThreadTest.class) {
				e++;
			}
			l2.lock();
			ff++;
			l2.unlock();
			
			rlock.readLock().lock();
			gg++;
			rlock.readLock().unlock();
			
			rlock.writeLock().lock();
			hh++;
			rlock.writeLock().unlock();
		}
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//Thread.sleep(10000);
		
		ExecutorService pool = (ExecutorService) Executors.newFixedThreadPool(200);
		Future<String> f = pool.submit(new ThreadTest().new A());
		System.out.println(f.get());
		pool.execute(new ThreadTest().new B());
		
		for(int i=0;i<100000;i++) {
			pool.execute(new ThreadTest().new B());
		}
		
		pool.shutdown();
		System.out.println(pool.awaitTermination(3000L, TimeUnit.SECONDS));
		
		System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + ff + " " + gg + " " + hh);
	}
}
