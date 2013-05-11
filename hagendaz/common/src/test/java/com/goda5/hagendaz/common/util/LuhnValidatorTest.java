package com.goda5.hagendaz.common.util;

import org.junit.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class LuhnValidatorTest {
	private LuhnValidator validator;
	@BeforeMethod
	public void init() {
		validator = new LuhnValidator();
	}
	
	public void isValid() {
		Assert.assertTrue(validator.isValid(new int[]{5,4,2,5,9,8,1,0,1,6,4,9,1,7,1,1}));
		Assert.assertTrue(validator.isValid("4111111111111111"));
		Assert.assertTrue(validator.isValid("4715632052276878"));
		Assert.assertTrue(validator.isValid("4659425027687222"));
	}
}