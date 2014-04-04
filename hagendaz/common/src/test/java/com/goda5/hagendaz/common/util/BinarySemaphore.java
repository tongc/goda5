package com.goda5.hagendaz.common.util;

public class BinarySemaphore {
	private boolean locked = false;

	BinarySemaphore(int initial) {
		locked = (initial == 0);
	}

	public synchronized void waitForNotify() throws InterruptedException {
		System.out.println("wait before lock reset " + Thread.currentThread().getName());
		while (locked) {
			wait();
		}
		System.out.println("notified " + Thread.currentThread().getName());
		System.out.println("-------------------------");
		locked = true;
	}

	public synchronized void notifyToWakeup() {
		System.out.println("notify before lock reset " + Thread.currentThread().getName());
		if (locked) {
			notify();
		}
		System.out.println("ohoh " + Thread.currentThread().getName());
		locked = false;
	}
	
	public static void main(String[] args) {
		final BinarySemaphore b = new BinarySemaphore(0);
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					b.notifyToWakeup();
				}
			}
		});
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					try {
						b.waitForNotify();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		t.start();
		t1.start();
	}
}
