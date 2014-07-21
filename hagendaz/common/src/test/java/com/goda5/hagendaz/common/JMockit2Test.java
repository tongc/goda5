package com.goda5.hagendaz.common;

import java.io.File;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import mockit.Cascading;
import mockit.Injectable;
import mockit.Mock;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import mockit.Tested;
import mockit.Verifications;
import mockit.integration.junit4.JMockit;

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

@RunWith(JMockit.class)
public class JMockit2Test {
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
	
	@Injectable
	private File file = null;
	
	@Cascading @Injectable
	private File file2 = null;
	
	@Mocked
	private String s = null;
	
	@Test
	public void test2(@Cascading @Injectable final File file3) {
		new NonStrictExpectations() {{
			file.toPath().getFileName().toString().substring(5); result = "abcdefghi";
			file.getParentFile().getParentFile().getParentFile().toPath().getFileName().toString().substring(5); result = "abc";
		}};
		System.out.println(file3.toPath());
		System.out.println(file.getParentFile().toPath().getFileName());
		System.out.println(file.toPath());
		System.out.println(file.getParentFile().getParentFile().getParentFile().toPath().getFileName().toString().substring(2));
	}
}
