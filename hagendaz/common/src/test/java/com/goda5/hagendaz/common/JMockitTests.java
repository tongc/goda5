package com.goda5.hagendaz.common;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import mockit.Injectable;
import mockit.NonStrictExpectations;
import mockit.Tested;

class TestSubject {
	private TestDependency d;
	
	public TestDependency runSomething() {
		return d;
	}
}

class TestDependency {
	private List<String> a;
	public boolean run() {
		a.add("");
		return false;
	}
}

public class JMockitTests {
	@Tested
	private TestSubject t;
	
	@Injectable
	private TestDependency d;
	
	@Test
	public void test() {
		new NonStrictExpectations() {{
			t.runSomething().run(); result = false;
		}};
		
		Assert.assertNotNull(t);
		Assert.assertNotNull(t.runSomething());
	}
}
