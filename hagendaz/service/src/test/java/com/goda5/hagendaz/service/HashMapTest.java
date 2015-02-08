package com.goda5.hagendaz.service;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.test.util.ReflectionTestUtils;
import org.testng.annotations.Test;

import java.util.HashMap;

import static org.testng.Assert.assertEquals;

/**
 * Created by tong on 08/02/2015.
 */
public class HashMapTest {
    @Test
    public void capacity() {
        HashMap<Integer, Integer> hm = new HashMap();
        for (int i = 0; i < 100; i++) {
            hm.put(RandomUtils.nextInt(), 2);
            Object f = ReflectionTestUtils.getField(hm, "threshold");
            System.out.println(String.valueOf(f));
        }
        assertEquals(1 << 8, new Double(Math.pow(2, 8)).intValue());

        int hash = 15;
        int hash1 = 16;
        int hash2 = 17;
        int length = 200;
        System.out.println("location of " + hash + " is " + (hash(hash) & length - 1));
        System.out.println("location of " + hash1 + " is " + (hash(hash1) & length - 1));
        System.out.println("location of " + hash2 + " is " + (hash(hash2) & length - 1));
    }

    static int hash(int h) {
        // This function ensures that hashCodes that differ only by
        // constant multiples at each bit position have a bounded
        // number of collisions (approximately 8 at default load factor).
        h ^= (h >>> 20) ^ (h >>> 12);
        int hash = h ^ (h >>> 7) ^ (h >>> 4);
        System.out.println("Hash for " + h + " is: " + hash);
        return hash;
    }
}
