package com.goda5.hagendaz.common;

import org.testng.Assert;
import org.testng.annotations.Test;

class A {
	protected static String var = "test"; 
	protected String var1 = "ttt";
	public String getVar() {
		return this.var;
	}
	
	public String getVar1() {
		return this.var1;
	}
}

class B extends A {
	protected static String var = "test1";
	protected String var1 = "ttt1";
}

public class BindingTest {
	@Test
	public void testBindingTest() {
		A a = new B();
		Assert.assertEquals(a.getVar1(), "ttt");
		//in any languages that support var polymophsim, the following would be valid
		//Assert.assertEquals(a.getVar1(), "ttt1");
		Assert.assertEquals(a.getVar(), "test");
		//in any languages that support late static binding like PHP, the following would be valid
		//Assert.assertEquals(b.getVar(), "test1");
	}

}
