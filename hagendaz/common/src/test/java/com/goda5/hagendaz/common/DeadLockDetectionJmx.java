package com.goda5.hagendaz.common;

import java.lang.management.ManagementFactory;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by tong on 10/05/2016.
 */
public class DeadLockDetectionJmx {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock l1 = new ReentrantLock();
        ReentrantLock l2 = new ReentrantLock();
        new Thread(() -> {
            l1.lock();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            l2.lock();
        }).start();

        new Thread(() -> {
            l2.lock();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            l1.lock();
        }).start();

        Thread.sleep(3000);
        System.out.printf("-----------------\n");
        for(long id:ManagementFactory.getThreadMXBean().findDeadlockedThreads()) {
            System.out.printf("deadlock thread: %s\n", ManagementFactory.getThreadMXBean().getThreadInfo(id));
        }
        for(long id:ManagementFactory.getThreadMXBean().getAllThreadIds()) {
            System.out.printf("%s\n", ManagementFactory.getThreadMXBean().getThreadInfo(id));
        }
        System.out.printf("-----------------\n");
    }
}
