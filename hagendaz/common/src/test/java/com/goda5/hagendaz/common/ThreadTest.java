package com.goda5.hagendaz.common;

import org.junit.Test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ThreadLocalRandom;
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
    }
}
