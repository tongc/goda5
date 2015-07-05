package com.goda5.hagendaz.common.util;

import java.util.Collection;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created by tong on 05/07/2015.
 */
public class ThreadJoin {
    static Runnable r1 = new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(3000);
                System.out.printf("r1");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    static Runnable r2 = new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(4000);
                System.out.printf("r2");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    static Runnable r3 = new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
                System.out.printf("r3");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newFixedThreadPool(3);
        Collection<Future<?>> tasks = new LinkedList<>();

        Future<?> future = exec.submit(r1);
        tasks.add(future);
        future = exec.submit(r2);
        tasks.add(future);
        future = exec.submit(r3);
        tasks.add(future);

        // wait for tasks completion
        for (Future<?> currTask : tasks) {
            try {
                currTask.get();
            } catch (Throwable thrown) {
                thrown.printStackTrace();
            }
        }
        exec.shutdown();
//        exec.awaitTermination(10000, TimeUnit.SECONDS);
    }
}
