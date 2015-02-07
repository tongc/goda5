package com.goda5.hagendaz.service;

import net.sf.ehcache.search.aggregator.Count;

import java.util.Map;
import java.util.concurrent.CountDownLatch;

/**
 * WorkerThread
 *
 * @author Pierre-Hugues Charbonneau
 */
public class WorkerThread implements Runnable {

    private Map<String, Integer> map = null;
    private final CountDownLatch end;

    public WorkerThread(Map<String, Integer> assignedMap, CountDownLatch end) {
        this.map = assignedMap;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = 0; i < 500000; i++) {
            // Return 2 integers between 1-1000000 inclusive
            Integer newInteger1 = (int) Math.ceil(Math.random() * 1000000);
            Integer newInteger2 = (int) Math.ceil(Math.random() * 1000000);

            // 1. Attempt to retrieve a random Integer element
            Integer retrievedInteger = map.get(String.valueOf(newInteger1));

            // 2. Attempt to insert a random Integer element
            map.put(String.valueOf(newInteger2), newInteger2);
        }
        System.out.println(Thread.currentThread().getName() + " finished");
        end.countDown();
    }

}