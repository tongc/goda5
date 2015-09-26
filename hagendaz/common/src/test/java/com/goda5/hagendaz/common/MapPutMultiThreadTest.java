package com.goda5.hagendaz.common;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.math.RandomUtils;
import org.testng.annotations.Test;

import com.goda5.hagendaz.common.domain.other.CustomMapService;

public class MapPutMultiThreadTest {
	CustomMapService cms = new CustomMapService();
	
	@Test
	public void put() throws InterruptedException {
		ExecutorService es = Executors.newFixedThreadPool(10);
		
		Callable<MyObject> c = new Callable<MyObject>() {
			@Override
			public MyObject call() throws Exception {
				int i = 0;
				while(i<1000) {
					Integer random = RandomUtils.nextInt(5);
					cms.putIfAbsent(random, "");
					//System.out.println(Thread.currentThread().getName() + cms.getMap());
					cms.remove(random);
					i++;
				}
				return null;
			}
		};
		
		List<Callable<MyObject>> calls = new ArrayList<Callable<MyObject>>();
		for(int i=0;i<10;i++) {
			calls.add(c);
		}
		es.invokeAll(calls);
		es.awaitTermination(5, TimeUnit.SECONDS);
		es.shutdown();
	}
}
