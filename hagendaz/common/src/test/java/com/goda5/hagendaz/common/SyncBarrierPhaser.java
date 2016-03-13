package com.goda5.hagendaz.common;

import org.apache.commons.lang.math.RandomUtils;

import java.util.concurrent.Phaser;

/**
 * Created by tong on 13/03/2016.
 */
public class SyncBarrierPhaser {
    private static volatile Phaser barrier = new Phaser(11);

    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<10;i++) {
            new Thread(new SyncBarrierPhaser().new Task()).start();
        }
        barrier.arriveAndDeregister();
    }

    class Task implements Runnable {
        @Override
        public void run() {
            int wait = RandomUtils.nextInt(3000);
            System.out.println(Thread.currentThread() + " random wait " + wait + " started");
            try {
                Thread.sleep(wait);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            barrier.arriveAndAwaitAdvance();
            System.out.println(Thread.currentThread() + " processed");
        }
    }
}
