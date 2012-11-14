package com.goda5.hagendaz.common;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.math.RandomUtils;
import org.testng.annotations.Test;

import com.goda5.hagendaz.common.domain.CustomMapService;

public class MapPutMultiThreadTest {
	CustomMapService cms = new CustomMapService();
	
	@Test
	public void testPut() throws InterruptedException {
		ExecutorService es = Executors.newFixedThreadPool(10);
		
		Callable<Object> c = new Callable<Object>() {
			@Override
			public Object call() throws Exception {
				while(true) {
					Integer random = RandomUtils.nextInt(5);
					cms.putIfAbsent(random, "");
					//System.out.println(Thread.currentThread().getName() + cms.getMap());
					cms.remove(random);
				}
			}
		};
		
		List<Callable<Object>> calls = new ArrayList<Callable<Object>>();
		for(int i=0;i<10;i++) {
			calls.add(c);
		}
		es.invokeAll(calls);
		es.awaitTermination(60, TimeUnit.SECONDS);
		es.shutdown();
	}
}
