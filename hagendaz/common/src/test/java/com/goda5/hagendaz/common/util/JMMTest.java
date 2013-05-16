package com.goda5.hagendaz.common.util;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class JMMTest {
	class A {
		public void test(List<String> a) {
			ThreadLocal<String> tl = new ThreadLocal<String>();
			//Java heap space error
			//while(true) {
			//	a.add("ddddd");
			//}
			//OOM: array size exceeds limit
			//long[] l = new long[Integer.MAX_VALUE];
			
			//PermGen OOM, ONLY if survivor space is larger than permgen.
			//String aa = "a";
			//while(true) {
			//	aa += aa;
			//	aa.intern();
			//}
			
			//java.lang.OutOfMemoryError: unable to create new native thread
			while(true) {
				Thread aa = new Thread(new Runnable() {
					@Override
					public void run() {
						try {
							Thread.sleep(10000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});
				aa.start();
			}
		}
	}
	
	@Test
	public void testStack() throws InterruptedException {
		Thread.sleep(10000);
		A a = new A();
		a.test(new ArrayList<String>());
	}
}
