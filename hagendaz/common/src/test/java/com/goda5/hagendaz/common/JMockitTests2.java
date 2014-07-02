package com.goda5.hagendaz.common;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import mockit.Injectable;
import mockit.NonStrictExpectations;
import mockit.Tested;
import mockit.Verifications;

class TestSubject1 {
	private TestDependency1 d;
	
	public TestDependency1 runSomething() {
		return d;
	}
}

class TestDependency1 {
	private List<String> a;
	public boolean run() {
		a.add("");
		return false;
	}
	
	public boolean run2() {
		return true;
	}
}

public class JMockitTests2 {
	@Tested
	private TestSubject1 t;
	
	@Injectable
	private TestDependency1 d;
	
	@Test
	public void test() {
		new NonStrictExpectations() {{
			t.runSomething().run(); result = false;
		}};
		
		Assert.assertNotNull(t);
		Assert.assertNotNull(t.runSomething());
		t.runSomething().run();
		t.runSomething().run2();
		
		new Verifications() {{
			t.runSomething().run2(); times = 1;
		}};
	}
}
