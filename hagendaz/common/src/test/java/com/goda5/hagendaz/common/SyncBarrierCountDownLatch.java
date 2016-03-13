package com.goda5.hagendaz.common;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;

/**
 * Created by tong on 13/03/2016.
 */
public class SyncBarrierCountDownLatch {
    static CountDownLatch barrier = new CountDownLatch(10);
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<10;i++) {
            new Thread(new SyncBarrierCountDownLatch().new Task()).start();
        }
        barrier.await();
        System.out.println("after all processings " + barrier.getCount());

        for(int i=0;i<20;i++) {
            new Thread(new SyncBarrierCountDownLatch().new Task()).start();
        }
        System.out.println("after all processings - this will be printed before all tasks finished " + barrier.getCount());
    }

    class Task implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread() + " processed");
            barrier.countDown();
        }
    }
}


