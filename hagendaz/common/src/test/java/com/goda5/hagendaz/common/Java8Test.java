package com.goda5.hagendaz.common;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Java8Test {
    //@Test
    public void test() {
        List<Integer> v = new ArrayList();
        for(int i=0;i<1000000;i++) {
            v.add(i);
        }

        long s = System.nanoTime();
        v.parallelStream().filter(x -> x.compareTo(new Integer(500)) != 0);
        long e = System.nanoTime();
        System.out.println(e - s);

        s = System.nanoTime();
        Iterator<Integer> i = v.iterator();
        while (i.hasNext()) {
            Integer x = i.next();
            if(x.compareTo(new Integer(500)) != 0) i.remove();
        }
        e = System.nanoTime();
        System.out.println(e - s);
    }

    @Test
    public void test2() {
        List<Integer> v = new ArrayList();
        Integer xx = new Integer(50000);
        for(int i=0;i<1000000;i++) {
            v.add(new Random().nextInt());
        }

        long s = System.nanoTime();
        for(int i=0;i<1000000;i++) {
            if(v.get(i).compareTo(xx) != 0) {
                v.set(i, new Random().nextInt());
            }
        }
        long e = System.nanoTime();
        System.out.println("test2 " + (e - s));
    }

    public static void main(String[] args) {
        for(int i=0;i<100;i++) {
            new Java8Test().test2();
        }
    }
}
