package com.goda5.hagendaz.common;

/**
 * Created by tong on 26/09/2015.
 */

class MyObjectObject {
    public int a;
}

public class LockOnObjNotVarTest {
    static LockOnObjNotVarTest l = new LockOnObjNotVarTest();
    public static void main(String[] args) throws InterruptedException {
        MyObjectObject o = new MyObjectObject();
        new Thread(() -> {
            for(int i=0;i<100;i++) {
                l.test(o);
            }
        }).start();
        new Thread(() -> {
            for(int i=0;i<100;i++) {
                l.test(o);
            }
        }).start();
        new Thread(() -> {
            for(int i=0;i<100;i++) {
                l.test(o);
            }
        }).start();
        new Thread(() -> {
            for(int i=0;i<100;i++) {
                l.test(o);
            }
        }).start();
        new Thread(() -> {
            for(int i=0;i<100;i++) {
                l.test(o);
            }
        }).start();

        Thread.sleep(1000);
        System.out.println("val " + o.a);
    }
    public void test(MyObjectObject o) {
        o.a = o.a + 1;
    }
}
