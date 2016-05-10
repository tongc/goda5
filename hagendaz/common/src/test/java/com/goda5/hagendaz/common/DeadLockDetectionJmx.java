package com.goda5.hagendaz.common;

import java.lang.management.ManagementFactory;

/**
 * Created by tong on 10/05/2016.
 */
public class DeadLockDetectionJmx {
    public static void main(String[] args) {
        System.out.printf("-----------------\n");
        System.out.printf("%s", ManagementFactory.getThreadMXBean().getThreadCount());
        for(long id:ManagementFactory.getThreadMXBean().getAllThreadIds()) {
            System.out.printf("%s\n", ManagementFactory.getThreadMXBean().getThreadInfo(id));
        }
        System.out.printf("-----------------\n");
    }
}
