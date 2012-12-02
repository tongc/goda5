package com.goda5.hagendaz.common;

import org.testng.annotations.Test;

public class RecursionTest {
	public void head(final int n) {
		if (n == 0) {
			return;
		} else {
			head(n - 1);
		}
		System.out.println(n);
	}

	@Test
	public void testHead() {
		head(10);
	}

	public void tail(final int n) {
		if (n == 0) {
			return;
		} else {
			System.out.println(n);
		}
		tail(n - 1);
	}

	@Test
	public void testTail() {
		tail(10);
	}
}
