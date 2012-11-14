package com.goda5.hagendaz.common;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class OOMTest {
	@Test
	public void testOOM() throws InterruptedException {
		Thread.sleep(15000);
		Thread tOuter = new Thread(new Runnable() {
			@Override
			public void run() {
				Thread t = new Thread(new Runnable() {
					@Override
					public void run() {
						java.util.List<String> test = new ArrayList<String>();
						String a = "aaa";
						for(int i=0;i<Integer.MAX_VALUE;i++) {
								a += "aaaaaaaaaaaaaaaaaaAAa";
								test.add(a);
						}
					}
				});
				t.start();
				try {
					t.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					java.util.List<String> test = new ArrayList<String>();
					String a = "aaa";
					for(int i=0;i<Integer.MAX_VALUE;i++) {
							a += "aaaaaaaaaaaaaaaaaaAAa";
							test.add(a);
					}
					
					Thread.sleep(3000);
					
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		tOuter.start();
		tOuter.join();
		Thread.sleep(3000);
	}
}
