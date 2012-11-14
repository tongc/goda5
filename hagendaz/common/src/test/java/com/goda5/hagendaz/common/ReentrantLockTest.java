package com.goda5.hagendaz.common;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.testng.annotations.Test;

public class ReentrantLockTest {
	
	@Test
	public void test() {
		ReentrantLock lock = new ReentrantLock();
		lock.lock();
		try {
			lock.lock();
		} finally {
			lock.unlock();
		}
	}
	
	@Test
	public void test2() {
		ReadWriteLock lock = new ReentrantReadWriteLock();
		lock.writeLock().lock();
		try {
			lock.writeLock().lock();
		} finally {
			lock.writeLock().unlock();
		}
	}
	
	@Test
	public void test1() {
		synchronized(ReentrantLockTest.class) {
			synchronized(ReentrantLockTest.class) {
				System.out.println("test");
			}
		}
	}
}
