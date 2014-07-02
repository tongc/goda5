package com.goda5.hagendaz.common;

import java.util.List;

import org.testng.annotations.Test;

import mockit.Cascading;
import mockit.Expectations;
import mockit.Mocked;
import mockit.Verifications;

class TestSubject {
	
	private TestDependency d2;
	
	public TestDependency runSomething() {
		TestDependency t0 = new TestDependency();
		System.out.println(t0.run());
		return d2;
	}
	
	public int runrunrun() {
		return new String("a").concat("a").concat("a").length();
	}
}

class TestDependency {
	private List<String> a;
	public boolean run() {
		a.add("");
		return false;
	}
	
	public boolean run2() {
		return !run3(51);
	}
	
	private Boolean run3(Integer a) {
		if(a>10) return true;
		return false;
	}
}

class TestDependency0 {
	private TestDependency0 cc;
	public TestDependency0 run() {
		return cc;
	}
}

public class JMockitTests {
	private TestSubject t;
	
	@Mocked
	private TestDependency d;
	
	@Cascading
	private TestDependency0 x;
	
	@Test
	public void test() {
		t = new TestSubject();
		new Expectations() {{
			new TestDependency(); result = d;
			d.run(); result = true;
			//x.run().run();
		}};
		
		t.runSomething();
		System.out.println(t.runrunrun());
		x.run().run();
		
		new Verifications() {{
			
		}};
	}
}
