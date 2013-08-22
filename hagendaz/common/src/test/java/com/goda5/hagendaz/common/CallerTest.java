package com.goda5.hagendaz.common;

import org.testng.annotations.Test;

public class CallerTest {
	class A {
		void test() {
			Throwable t = new Throwable();
			StackTraceElement ste = t.getStackTrace()[1];
			System.out.println(ste.getClassName() + ":" + ste.getMethodName() + " called me.");
			for(StackTraceElement s:t.getStackTrace()) {
				System.out.println(s.getClassName() + ":" + s.getMethodName());
			}
		}
	}
	
	class B {
		public void call() {
			A a = new A();
			a.test();
		}
	}
	
	@Test
	public void testCaller() {
		B b = new B();
		b.call();
	}
}
