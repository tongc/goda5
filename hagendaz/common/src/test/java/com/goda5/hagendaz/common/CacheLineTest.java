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
}
