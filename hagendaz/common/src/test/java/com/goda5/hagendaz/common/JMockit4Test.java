package com.goda5.hagendaz.common;

import java.io.File;

import org.junit.Test;
import org.junit.runner.RunWith;

import mockit.Mocked;
import mockit.NonStrictExpectations;
import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class)
public class JMockit4Test {
	@Mocked
	private File file;
	
	@Test
	public void test() {
		new NonStrictExpectations() {{
			file.getAbsolutePath(); result = "a";
		}};
		
		System.out.println("test() " + file.getAbsolutePath());
		System.out.println("test() " + new File("SOMETHING").getAbsolutePath());
	}
	
	@Test
	public void test1(@Mocked final File file2) {
		new NonStrictExpectations() {{
			file.getAbsolutePath(); result = "a";
			file2.getAbsolutePath(); result = "b";
		}};
		
		System.out.println("test1() " + file.getAbsolutePath());
		System.out.println("test1() " + new File("SOMETHINGELSE").getAbsolutePath());
		System.out.println("test1() " + file2.getAbsolutePath());
	}
}
