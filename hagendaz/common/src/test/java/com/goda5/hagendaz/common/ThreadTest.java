package com.goda5.hagendaz.common;

import org.junit.Test;

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
}
