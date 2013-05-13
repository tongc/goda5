package com.goda5.hagendaz.common.util;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CommonTest {
	@Test
	public void testString() {
		Assert.assertEquals("AAA", "AAA");
		Assert.assertTrue("AAA" == "AAA");
		Assert.assertFalse(new String("AAA") == new String("AAA"));
		Assert.assertTrue("AAA".equals("AAA"));
	}
}
