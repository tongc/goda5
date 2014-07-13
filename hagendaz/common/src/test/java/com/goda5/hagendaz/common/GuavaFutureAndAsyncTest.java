package com.goda5.hagendaz.common;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import mockit.Expectations;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import mockit.Tested;
import mockit.integration.junit4.JMockit;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.goda5.hagendaz.common.GuavaFutureAndAsync.MyCallable;
import com.goda5.hagendaz.common.GuavaFutureAndAsync.MyCallableHandler;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;

@RunWith(JMockit.class)
public class GuavaFutureAndAsyncTest {
	@Tested
	private GuavaFutureAndAsync c = new GuavaFutureAndAsync();
	
	@Mocked 
	private Executors e;
	
	@Mocked
	private ExecutorService es;
	
	@Mocked
	private ListeningExecutorService les;
	
	@Mocked
	private ListenableFuture<Boolean> f;
	
	@Mocked
	private MyCallable callable;
	
	@Mocked
	private MyCallableHandler handler;
	
	@Test
	public void t() throws InterruptedException {
		new NonStrictExpectations() {{
			Executors.newFixedThreadPool(5); result = es;
			MoreExecutors.listeningDecorator(es); result = les;
			MoreExecutors.sameThreadExecutor(); result = les;
			c.new MyCallable((String)any); result = callable; times = 4;
			les.submit((MyCallable)any); result = f;
			c.new MyCallableHandler(f, (String)any); result = handler; times = 4;
			f.addListener((MyCallableHandler)any, les); times = 5;
		}};
		c.execute(); 
	}
}
