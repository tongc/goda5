package com.goda5.hagendaz.common;

import org.junit.Test;

/**
 * Created by tong on 12/05/2016.
 */
public class IdentifyHashCode {
    @Test
    public void test() {
        System.out.println(System.identityHashCode("aaa"));
        System.out.println(System.identityHashCode("aaa"));
        System.out.println(System.identityHashCode(new String("aaa")));
        System.out.println(System.identityHashCode(new String("aaa")));
        System.out.println(System.identityHashCode(new String("aaa")));
        System.out.println(new String("aaa").hashCode());
        System.out.println(new String("aaa").hashCode());
        System.out.println(new Integer(5).hashCode());
        System.out.println(System.identityHashCode(new Integer(6)));
        System.out.println(System.identityHashCode(new Integer(5)));
    }
}
