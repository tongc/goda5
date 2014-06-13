package com.goda5.hagendaz.common.javaconcurrencyinpractice;

import junit.framework.Assert;

import org.testng.annotations.Test;

public class Singleton {
	public static String test = "test";
	
	public static class ResourceHolderPublic {
		public static Singleton resource = new Singleton();
	}
	
	private static class ResourceHolder {
		public static Singleton resource = new Singleton();
	}

	public static Singleton getResource() {
		return ResourceHolder.resource;
	}
	
	public String doSomething() {
		return "hello";
	}
	
	@Test
	public void test() {
		Singleton s = Singleton.getResource();
		Assert.assertEquals("hello", s.doSomething());
	}
}
