package com.goda5.hagendaz.common;

import java.util.Stack;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

class Queue {
	private Stack<String> stack1 = new Stack<String>();
	
	@Override
	public String toString() {
		return stack1.toString();
	}
	
	public void eq(String element) {
		stack1.push(element);
	}
	
	public String dq() {
		Stack<String> stack2 = new Stack<String>();
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		String val = stack2.pop();
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		return val;
	}
}

public class QueueTest {
	private Queue q = null;
	
	@BeforeMethod
	public void init() {
		q = new Queue();
	}
	
	
	@Test
	public void testEq() {
		q.eq("test");
		q.eq("test2");
		Assert.assertEquals("[test, test2]", q.toString());
	}
	
	@Test
	public void testDq() {
		q.eq("test");
		q.eq("test1");
		q.eq("test2");
		Assert.assertEquals("test", q.dq());
		q.eq("test3");
		Assert.assertEquals("test1", q.dq());
		Assert.assertEquals("test2", q.dq());
		q.eq("test4");
		Assert.assertEquals("test3", q.dq());
		Assert.assertEquals("test4", q.dq());
		q.eq("test5");
		q.eq("test6");
		Assert.assertEquals("test5", q.dq());
		Assert.assertEquals("test6", q.dq());
	}
}
