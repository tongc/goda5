package com.goda5.hagendaz.common;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by tong on 26/09/2015.
 */

class MyObjectObject {
    public int a;
}

public class LockOnObjNotVarTest {
    static LockOnObjNotVarTest l = new LockOnObjNotVarTest();
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        MyObjectObject o = new MyObjectObject();
        Runnable r = () -> {
            for(int i=0;i<100000;i++) {
                l.test(o);
            }
        };
        executorService.execute(r);
        executorService.execute(r);
        executorService.execute(r);
        executorService.execute(r);
        executorService.execute(r);
        executorService.execute(r);
        executorService.execute(r);
        executorService.execute(r);
        executorService.execute(r);
        executorService.execute(r);

        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
        }
        System.out.println("val " + o.a);
    }
    public void test(MyObjectObject o) {
//        synchronized (o) {
            for (int i = 0; i < 100; i++) {
                o.a = o.a + 1;
                o.a = o.a + 1;
            }
//        }
    }
}
