package com.goda5.hagendaz.common;

import org.testng.annotations.Test;


public class ArrayTest {

	public ArrayTest() {
	}
	
	@Test(expectedExceptions = ArrayStoreException.class)
	public void test() {
		String[] a = {"", "", ""};
		Object[] b = a;
		b[0] = 1;
	}

}
