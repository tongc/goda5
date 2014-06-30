package com.goda5.hagendaz.common;

import org.testng.Assert;
import org.testng.annotations.Test;

import mockit.Injectable;
import mockit.Tested;

class TestSubject {
	private TestDependency d;
	
	public Object runSomething() {
		return d;
	}
}

class TestDependency {
	
}

public class JMockitTests {
	@Tested
	private TestSubject t;
	
	@Injectable
	private TestDependency d;
	
	@Test
	public void test() {
		Assert.assertNotNull(t);
		Assert.assertNotNull(t.runSomething());
	}
}
