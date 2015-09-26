package com.goda5.hagendaz.common;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by tong on 01/06/2015.
 */
public class BlockingQueueTest {
    private final BlockingQueue<MyObject> queue = new ArrayBlockingQueue(1);

    public void putItem(MyObject obj) {
        try {
            queue.put(obj);
            System.out.println("put " + queue.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void getItem() {
        try {
            queue.take();
            System.out.println("get " + queue.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final BlockingQueueTest t = new BlockingQueueTest();
        new Thread(new Runnable() {
            @Override
            public void run() {
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
                t.putItem(new MyObject());
                t.putItem(new MyObject());
                t.putItem(new MyObject());
                t.putItem(new MyObject());
                t.putItem(new MyObject());
            }
        }).start();
    }
}
