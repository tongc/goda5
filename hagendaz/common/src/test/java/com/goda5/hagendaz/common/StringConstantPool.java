package com.goda5.hagendaz.common;

import org.springframework.test.util.ReflectionTestUtils;

import java.lang.management.ManagementFactory;

/**
 * Created by tong on 10/05/2016.
 */
public class StringConstantPool {


    public static void main(String[] args) {
        reportMemoryUsage();

        String a = "a";
        for(int i=0;i<10000;i++) {
            a+=i;
        }

        String b = "a";
        for(int i=0;i<10000;i++) {
            b+=i;
        }

        reportMemoryUsage();

        a.intern();
        b.intern();

        reportMemoryUsage();

        System.out.println(ReflectionTestUtils.getField(b, "value"));
        System.out.println(ReflectionTestUtils.getField(a, "value"));
    }

    private static void reportMemoryUsage() {
        System.out.printf("-----------------\n");
        ManagementFactory.getMemoryPoolMXBeans()
                .stream()
//                .filter(mpBean -> mpBean.getType() == MemoryType.HEAP)
                .forEachOrdered(
                        mpBean -> System.out.printf(
                        "Name: %s: %s\n",
                        mpBean.getName(), mpBean.getUsage()
        ));
        System.out.printf("-----------------\n");
    }
}
