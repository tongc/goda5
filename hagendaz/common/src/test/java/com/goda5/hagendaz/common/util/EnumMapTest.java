package com.goda5.hagendaz.common.util;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class EnumMapTest {
	enum TestA {
		A, B, C
	}
	
	@Test
	public void test() {
		Map<TestA, String> a = new HashMap<TestA, String>();
		//EnumMap is better in terms of performace and it doesn't use hashcode for comparing the keys.
		Map<TestA, String> b = new EnumMap<TestA, String>(TestA.class);
		a.put(TestA.A, "a");
		b.put(TestA.A, "a");
	}
}
