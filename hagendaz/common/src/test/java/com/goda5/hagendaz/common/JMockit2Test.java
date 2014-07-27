package com.goda5.hagendaz.common;

import java.io.File;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import mockit.Injectable;
import mockit.Mocked;
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

public class JMockit2Test {
	@Tested
	private TestSubject1 t;
	
	@Injectable
	private TestDependency1 d;
	
	@Mocked
	private File file1;
	
	@Mocked
	private File file2;

	@Test
	public void test() {
		new NonStrictExpectations() {{
			file1.getAbsolutePath(); result = "test";
			file2.getAbsolutePath(); result = "test1";
		}};
		
		System.out.println("aaa" + file1.getAbsolutePath());
		System.out.println("bbb" + new File("dsf").getAbsolutePath());
		//System.out.println("ccc" + file2.getAbsolutePath());
	}
	
	@Test
	public void test2() {
		System.out.println("aaa" + file1.getAbsolutePath());
		System.out.println("bbb" + new File("dsf").getAbsolutePath());
	}
}
