package com.goda5.hagendaz.service;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by tong on 31/01/2015.
 */
public class ConcurrentHashMapTest {
    private static final ConcurrentHashMap map = new ConcurrentHashMap();

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                map.putIfAbsent("a", "b");
            }
        };
        executorService.submit(runnable);
        executorService.submit(runnable);
        executorService.submit(runnable);
        executorService.submit(runnable);
        executorService.submit(runnable);
        executorService.submit(runnable);
        executorService.submit(runnable);
        executorService.submit(runnable);
        executorService.submit(runnable);


        executorService.awaitTermination(1000, TimeUnit.MILLISECONDS);
        System.out.printf("Size: " + map.size());

    }
}
