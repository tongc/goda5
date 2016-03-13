package com.goda5.hagendaz.common;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by tong on 13/03/2016.
 */
public class SyncBarrier {
    static CyclicBarrier barrier;
    public static void main(String[] args) {
        barrier = new CyclicBarrier(10, new AfterProcessing());

        for(int i=0;i<10;i++) {
            new Thread(new Task()).start();
        }

        for(int i=0;i<20;i++) {
            new Thread(new Task()).start();
        }

        for(int i=0;i<9;i++) {
            new Thread(new Task()).start();
        }
    }
}

class AfterProcessing implements Runnable {
    @Override
    public void run() {
        System.out.println("all done " + Thread.currentThread().getName() + " post processing");
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread() + " processed");
        try {
            SyncBarrier.barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
