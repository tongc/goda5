package com.goda5.hagendaz.common;

import java.util.Random;

/**
 * Created by tong on 06/03/2016.
 */
public class LongTest {
    private static Long l = 1000000000000000000L;
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for(long i=0;i<1000000000000L;i++) {
                Random r = new Random(System.currentTimeMillis());
                l += r.nextInt(2);
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i=0;i<10000;i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(l);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
