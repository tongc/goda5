package com.goda5.hagendaz.common;

import java.io.File;

import org.junit.Test;
import org.junit.runner.RunWith;

import mockit.Injectable;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class)
public class JMockit3Test {
	@Injectable
	private File file;
	
	@Injectable
	private File file2;
	
	@Test
	public void test() {
		new NonStrictExpectations() {{
			file.toString(); result = "test";
			file.getAbsolutePath(); result = "test1";
		}};
		
		System.out.println(file.toString());
		System.out.println(file2.toString());
		System.out.println(file.getAbsolutePath());
		System.out.println(file2.getAbsolutePath());
		System.out.println(new File("something").toPath().getNameCount());
		System.out.println(new File("something").getAbsolutePath());
		
	}
	
	@Test
	public void test3() {
		new NonStrictExpectations() {{
			file.getAbsolutePath(); result = "test";
		}};
		
		System.out.println("aaa" + file.getAbsolutePath());
		System.out.println("bbb" + new File("dsf").getAbsolutePath());
		//System.out.println("ccc" + file2.getAbsolutePath());
	}
	
	@Test
	public void test2() {
		System.out.println("aaa" + file.getAbsolutePath());
		System.out.println("bbb" + new File("dsf").getAbsolutePath());
	}
}
