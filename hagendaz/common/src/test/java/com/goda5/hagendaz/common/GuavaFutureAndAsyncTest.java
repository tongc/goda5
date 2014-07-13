package com.goda5.hagendaz.common;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

import org.junit.Test;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;

public class GuavaFutureAndAsyncTest {
	@Test
	public void a() throws InterruptedException {
		ListeningExecutorService l = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(5));
		ListenableFuture<Boolean> f = l.submit(new MyCallable("1"));
		f.addListener(new MyCallableHandler(f, "1"), MoreExecutors.sameThreadExecutor());
		
		ListenableFuture<Boolean> f1 = l.submit(new MyCallable("2"));
		f1.addListener(new MyCallableHandler(f1, "2"), MoreExecutors.sameThreadExecutor());
		
		ListenableFuture<Boolean> f2 = l.submit(new MyCallable("3"));
		f2.addListener(new MyCallableHandler(f2, "3"), MoreExecutors.sameThreadExecutor());
		
		ListenableFuture<Boolean> f3 = l.submit(new MyCallable("4"));
		Futures.addCallback(f3, new FutureCallback<Boolean>() {
			@Override
			public void onSuccess(Boolean result) {
				System.out.println(Thread.currentThread().getName());
				System.out.println(result);
			}
			@Override
			public void onFailure(Throwable t) {
				System.out.println(t.getMessage());
			}
		});
		
		System.out.println(Thread.currentThread().getName());
		Thread.sleep(3000);
	}
	
	class MyCallableHandler implements Runnable {
		private final ListenableFuture<Boolean> f;
		private String name;

		public MyCallableHandler(ListenableFuture<Boolean> f, String name) {
			this.f = f;
			this.name = name;
		}
		
		@Override
		public void run() {
			try {
				System.out.println(name + " : " + Thread.currentThread().getName());
				System.out.println(f.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
	}
	
	class MyCallable implements Callable<Boolean> {
		private String name;
		public MyCallable(String name) {
			this.name = name;
		}
		
		@Override
		public Boolean call() throws Exception {
			Thread.sleep(1000);
			System.out.println(name + " called " + Thread.currentThread().getName());
			return Boolean.TRUE;
		}
	}
}
