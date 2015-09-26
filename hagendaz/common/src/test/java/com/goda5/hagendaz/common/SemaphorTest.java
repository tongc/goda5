package com.goda5.hagendaz.common;

import java.util.concurrent.Semaphore;

/**
 * Created by tong on 01/06/2015.
 */
public class SemaphorTest {
    private static final int MAX_AVAILABLE = 5;
    private final Semaphore available = new Semaphore(MAX_AVAILABLE, true);

    public MyObject getItem() throws InterruptedException {
        available.acquire();
        System.out.println("get " + available.availablePermits());
        return null;
    }

    public void putItem(MyObject x) {
        available.release();
        System.out.println("put " + available.availablePermits());
    }

    // Not a particularly efficient data structure; just for demo

    protected MyObject[] items = new MyObject[]{new MyObject(), new MyObject(), new MyObject(), new MyObject(), new MyObject()};
    protected boolean[] used = new boolean[MAX_AVAILABLE];

    protected synchronized MyObject getNextAvailableItem() {
        for (int i = 0; i < MAX_AVAILABLE; ++i) {
            if (!used[i]) {
                used[i] = true;
                return items[i];
            }
        }
        return null; // not reached
    }

    protected synchronized boolean markAsUnused(MyObject item) {
        return true;
    }

    public static void main(String[] args) throws InterruptedException {
        final SemaphorTest t = new SemaphorTest();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    t.getItem();
                    t.getItem();
                    t.getItem();
                    t.getItem();
                    t.getItem();
                    t.getItem();
                    t.getItem();
                    t.getItem();
                    t.getItem();
                    t.getItem();
                    t.getItem();
                    t.getItem();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                t.putItem(new MyObject());
                t.putItem(new MyObject());
                t.putItem(new MyObject());
                t.putItem(new MyObject());
                t.putItem(new MyObject());
                t.putItem(new MyObject());
                t.putItem(new MyObject());
            }
        }).start();
    }

}
