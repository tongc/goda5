package com.goda5.hagendaz.common.util;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CommonTest {
	@Test(expectedExceptions=NullPointerException.class)
	public void testString() {
		Assert.assertEquals("AAA", "AAA");
		Assert.assertTrue("AAA" == "AAA");
		Assert.assertFalse(new String("AAA") == new String("AAA"));
		Assert.assertTrue("AAA".equals("AAA"));
		Integer a = null;
		new CommonTest().test(a);
	}

	public void test(int a) {
	}
}
