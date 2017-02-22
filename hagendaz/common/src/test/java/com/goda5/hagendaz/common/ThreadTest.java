package com.goda5.hagendaz.common;

import org.junit.Test;

import java.lang.management.ManagementFactory;
import java.lang.management.MonitorInfo;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Supplier;

/**
 * Created by tong on 22/02/2017.
 */
public class ThreadTest {
    ThreadLocal t = ThreadLocal.withInitial((Supplier<Object>) () -> "test");
    ThreadLocalRandom r = ThreadLocalRandom.current();

    @Test
    public void test() throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                String a = null;
                System.out.println(r.nextInt());
                a.length();
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t.setUncaughtExceptionHandler((t1, e) -> System.out.println(t1.getName() + " " + e.getMessage()));
        t.start();
        Thread.sleep(1000);
        System.out.println(t.getState());
    }

    @Test
    public void barrier() throws InterruptedException {
        final CyclicBarrier cb = new CyclicBarrier(3, () -> System.out.println("test"));

        Thread t1 = new Thread(() -> {
            System.out.println("before" + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
                cb.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("after" + Thread.currentThread().getName());
        });
        Thread t2 = new Thread(() -> {
            System.out.println("before" + Thread.currentThread().getName());
            try {
                Thread.sleep(1500);
                cb.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("after" + Thread.currentThread().getName());
        });
        Thread t3 = new Thread(() -> {
            System.out.println("before" + Thread.currentThread().getName());
            try {
                Thread.sleep(2500);
                cb.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("after" + Thread.currentThread().getName());
        });

        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(5000);

        Thread t4 = new Thread(() -> {
            System.out.println("before" + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
                cb.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("after" + Thread.currentThread().getName());
        });
        Thread t5 = new Thread(() -> {
            System.out.println("before" + Thread.currentThread().getName());
            try {
                Thread.sleep(1500);
                cb.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("after" + Thread.currentThread().getName());
        });
        Thread t6 = new Thread(() -> {
            System.out.println("before" + Thread.currentThread().getName());
            try {
                Thread.sleep(2500);
                cb.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("after" + Thread.currentThread().getName());
        });
        t4.start();
        t5.start();
        t6.start();

        Thread.sleep(5000);
    }

    @Test
    public void interrupt() throws InterruptedException {
        Thread a = new Thread(() -> {
            //simulate long operation
            while (true) {
                if (Thread.interrupted()) {
                    System.out.println("interrupted");
                }
            }
        });
        a.start();
        a.interrupt();
        Thread.sleep(100);
        System.out.println(a.getState());
        a.interrupt();
        Thread.sleep(100);
        System.out.println(a.getState());
        a.interrupt();
        Thread.sleep(100);
        System.out.println(a.getState());
        Thread.sleep(1000);
    }

    @Test
    public void deadlock() throws InterruptedException {
        Lock c = new ReentrantLock();
        c.lock();
        System.out.println(Thread.holdsLock(c));

        synchronized (c) {
            System.out.println(Thread.holdsLock(c));
        }

        Lock a = new ReentrantLock();
        Lock b = new ReentrantLock();
        System.out.println(a);
        System.out.println(b);

        Thread aa = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    a.lock();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("holds a " + Thread.holdsLock(a));
                    System.out.println("holds b " + Thread.holdsLock(b));
                    b.lock();
                    a.unlock();
                    b.unlock();
                }
            }
        });

        Thread bb = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    b.lock();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("holds a " + Thread.holdsLock(a));
                    System.out.println("holds b " + Thread.holdsLock(b));
                    a.lock();
                    b.unlock();
                    a.unlock();
                }
            }
        });

        aa.start();
        bb.start();

        Thread.sleep(1000);
        System.out.println("state " + aa.getState());
        System.out.println("state " + bb.getState());

        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] ti = bean.getThreadInfo(bean.getAllThreadIds(), true, true);
        for (ThreadInfo threadInfo:ti) {
            System.out.println("lock name " + threadInfo.getLockName());
            for(MonitorInfo monitorInfo:threadInfo.getLockedMonitors()) {
                System.out.println("line number " +  monitorInfo.getLockedStackFrame().getLineNumber());
            }
        }

        Thread.sleep(5000);
        System.out.println(a);
        System.out.println(b);
    }
}
