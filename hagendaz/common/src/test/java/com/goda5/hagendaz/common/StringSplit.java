package com.goda5.hagendaz.common;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by tong on 21/02/2016.
 */
public class StringSplit {
    @Test
    public void testSplit() {
        System.out.printf(Arrays.asList("a.b.cdef".split("\\.")).toString());
        System.out.printf(Arrays.asList("a.b.cdef".split(".")).toString());
        System.out.printf(Arrays.asList("a.b.cdef".split("\\*")).toString());
        System.out.printf(Arrays.asList("a.b.cdef".split(",")).toString());
        System.out.printf(Arrays.asList("a.b.cdef".split("")).toString());
        System.out.printf(Arrays.asList("a.b.cdef".split("[.]")).toString());
    }
}
