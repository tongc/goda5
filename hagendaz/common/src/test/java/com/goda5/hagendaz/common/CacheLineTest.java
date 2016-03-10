package com.goda5.hagendaz.common;

import org.apache.commons.lang.math.RandomUtils;
import org.junit.Test;

import java.util.Random;

/**
 * Created by tong on 10/03/2016.
 */
public class CacheLineTest {
    @Test
    public void cachelineNotInUse() {
        int[] arr = new int[64 * 1024 * 1024];

        long l = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            int random = RandomUtils.nextInt(10);
            arr[i] *= random;
        }
        long l1 = System.nanoTime();

        long l2 = System.nanoTime();
        for (int i = 0; i < arr.length; i += 16) {
            int random = RandomUtils.nextInt(10);
            arr[i] *= random;
        }
        long l3 = System.nanoTime();

        System.out.println(l1 - l);
        System.out.println(l3 - l2);
    }

    @Test
    public void cachelineInOperation() {
        int[] arr = new int[64 * 1024 * 1024];

        long l = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 13;
        }
        long l1 = System.nanoTime();

        long l2 = System.nanoTime();
        for (int i = 0; i < arr.length; i += 16) {
            arr[i] *= 13;
        }
        long l3 = System.nanoTime();

        long l4 = System.nanoTime();
        for (int i = 0; i < arr.length; i += 32) {
            arr[i] *= 13;
        }
        long l5 = System.nanoTime();

        long l6 = System.nanoTime();
        for (int i = 0; i < arr.length; i += 64) {
            arr[i] *= 13;
        }
        long l7 = System.nanoTime();

        long l8 = System.nanoTime();
        for (int i = 0; i < arr.length; i += 128) {
            arr[i] *= 13;
        }
        long l9 = System.nanoTime();

        System.out.println(l1 - l);
        System.out.println(l3 - l2);
        System.out.println(l5 - l4);
        System.out.println(l7 - l6);
        System.out.println(l9 - l8);
    }

    @Test
    public void instructionLevelParallel() {
        int steps = 256 * 1024 * 1024;
        int[] a = new int[2];

        long l1 = System.nanoTime();
        for (int i=0; i<steps; i++) { a[0]++; a[0]++; }
        long l2 = System.nanoTime();

        long l3 = System.nanoTime();
        for (int i=0; i<steps; i++) { a[0]++; a[1]++; }
        long l4 = System.nanoTime();

        System.out.println(l2 - l1);
        System.out.println(l4 - l3);
    }

    @Test
    public void falseCacheSharing() throws InterruptedException {
        s_counter = new int[1024];
        long l1 = System.nanoTime();
        Thread a = new Thread(() -> {
            updateCounter(0);
        });
        Thread b = new Thread(() -> {
            updateCounter(1);
        });
        Thread c = new Thread(() -> {
            updateCounter(2);
        });
        Thread d = new Thread(() -> {
            updateCounter(3);
        });

        a.start();
        b.start();
        c.start();
        d.start();
        a.join();
        b.join();
        c.join();
        d.join();

        long l2 = System.nanoTime();

        System.out.println(l2 - l1);
    }

    @Test
    public void falseCacheSharing1() throws InterruptedException {
        s_counter = new int[1024];
        long l1 = System.nanoTime();
        Thread a = new Thread(() -> {
            updateCounter(16);
        });
        Thread b = new Thread(() -> {
            updateCounter(32);
        });
        Thread c = new Thread(() -> {
            updateCounter(48);
        });
        Thread d = new Thread(() -> {
            updateCounter(64);
        });

        a.start();
        b.start();
        c.start();
        d.start();
        a.join();
        b.join();
        c.join();
        d.join();

        long l2 = System.nanoTime();

        System.out.println(l2 - l1);
    }

    int[] s_counter = null;
    void updateCounter(int position) {
        for (int j = 0; j < 100000000; j++)
        {
            s_counter[position] = s_counter[position] + 3;
        }
    }
}
