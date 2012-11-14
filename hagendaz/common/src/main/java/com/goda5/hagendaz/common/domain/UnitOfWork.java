package com.goda5.hagendaz.common.domain;

public class UnitOfWork {
	public void execute() {
		System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis());
	}
}
