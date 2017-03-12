package com.goda5.hagendaz.common;

import org.junit.Test;

import java.lang.management.ManagementFactory;
import java.lang.management.MonitorInfo;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.*;
import java.util.function.Consumer;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertTrue;

/**
 * Created by tong on 22/02/2017.
 */
public class ThreadTest {
    ThreadLocal t = ThreadLocal.withInitial((Supplier<Object>) () -> "test");
    ThreadLocalRandom r = ThreadLocalRandom.current();

    @Test
    public void test() throws InterruptedException {
        Thread t = new Thread(() -> {
            try {
                String a = null;
                System.out.println(r.nextInt());
                a.length();
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t.setUncaughtExceptionHandler((t1, e) -> System.out.println(t1.getName() + " " + e.getMessage()));
        t.start();
        Thread.sleep(1000);
        System.out.println(t.getState());
    }

    @Test
    public void barrier() throws InterruptedException {
        final CyclicBarrier cb = new CyclicBarrier(3, () -> System.out.println("test"));

        Thread t1 = new Thread(() -> {
            System.out.println("before" + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
                cb.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("after" + Thread.currentThread().getName());
        });
        Thread t2 = new Thread(() -> {
            System.out.println("before" + Thread.currentThread().getName());
            try {
                Thread.sleep(1500);
                cb.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("after" + Thread.currentThread().getName());
        });
        Thread t3 = new Thread(() -> {
            System.out.println("before" + Thread.currentThread().getName());
            try {
                Thread.sleep(2500);
                cb.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("after" + Thread.currentThread().getName());
        });

        t1.start();
        t2.start();
        t3.start();

        Thread.sleep(5000);

        Thread t4 = new Thread(() -> {
            System.out.println("before" + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
                cb.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("after" + Thread.currentThread().getName());
        });
        Thread t5 = new Thread(() -> {
            System.out.println("before" + Thread.currentThread().getName());
            try {
                Thread.sleep(1500);
                cb.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("after" + Thread.currentThread().getName());
        });
        Thread t6 = new Thread(() -> {
            System.out.println("before" + Thread.currentThread().getName());
            try {
                Thread.sleep(2500);
                cb.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("after" + Thread.currentThread().getName());
        });
        t4.start();
        t5.start();
        t6.start();

        Thread.sleep(5000);
    }

    @Test
    public void interrupt() throws InterruptedException {
        Thread a = new Thread(() -> {
            //simulate long operation
            while (true) {
                if (Thread.interrupted()) {
                    System.out.println("interrupted");
                }
            }
        });
        a.start();
        a.interrupt();
        Thread.sleep(100);
        System.out.println(a.getState());
        a.interrupt();
        Thread.sleep(100);
        System.out.println(a.getState());
        a.interrupt();
        Thread.sleep(100);
        System.out.println(a.getState());
        Thread.sleep(1000);
    }

    volatile int i = 0;

    @Test
    public void isPrimeTest() {
        assertTrue(isPrime(1));
        assertTrue(isPrime(2));
        assertTrue(isPrime(7));
        assertTrue(isPrime(13));
        assertTrue(isPrime(17));
    }

    public boolean isPrime(int num) {
        for(int i=2;i<num-1;i++) {
            if(num%2 == 0) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void deadlock2() throws InterruptedException {
        Lock a = new ReentrantLock();
        Lock b = new ReentrantLock();

        Thread ta = new Thread(() -> {
            a.lock();
            System.out.println("a locked 1");
            ++i;
            while(i!=2) {

            }
            b.lock();
            System.out.println("b locked 1");
        });

        Thread tb = new Thread(() -> {
            b.lock();
            System.out.println("b locked 2");
            ++i;
            while(i!=2) {

            }
            a.lock();
            System.out.println("b locked 2");
        });

        ta.start();
        tb.start();
        Thread.sleep(5000);
    }

    @Test
    public void deadlock() throws InterruptedException {
        Lock c = new ReentrantLock();
        c.lock();
        System.out.println(Thread.holdsLock(c));

        synchronized (c) {
            System.out.println(Thread.holdsLock(c));
        }

        Lock a = new ReentrantLock();
        Lock b = new ReentrantLock();
        System.out.println(a);
        System.out.println(b);

        Thread aa = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    a.lock();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("holds a " + Thread.holdsLock(a));
                    System.out.println("holds b " + Thread.holdsLock(b));
                    b.lock();
                    a.unlock();
                    b.unlock();
                }
            }
        });

        Thread bb = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    b.lock();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("holds a " + Thread.holdsLock(a));
                    System.out.println("holds b " + Thread.holdsLock(b));
                    a.lock();
                    b.unlock();
                    a.unlock();
                }
            }
        });

        aa.start();
        bb.start();

        Thread.sleep(1000);
        System.out.println("state " + aa.getState());
        System.out.println("state " + bb.getState());

        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] ti = bean.getThreadInfo(bean.getAllThreadIds(), true, true);
        for (ThreadInfo threadInfo : ti) {
            System.out.println("lock name " + threadInfo.getLockName());
            for (MonitorInfo monitorInfo : threadInfo.getLockedMonitors()) {
                System.out.println("line number " + monitorInfo.getLockedStackFrame().getLineNumber());
            }
        }

        Thread.sleep(3000);
        System.out.println(a);
        System.out.println(b);

        long[] threadIds = bean.findDeadlockedThreads(); // Returns null if no threads are deadlocked.

        if (threadIds != null) {
            ThreadInfo[] infos = bean.getThreadInfo(threadIds);

            for (ThreadInfo info : infos) {
                System.out.println("deadlock : " + info.getLockInfo());
                System.out.println("deadlock : " + info.getLockName());
                System.out.println("deadlock : " + info.getThreadName());
                System.out.println("deadlock : " + info.getBlockedCount());
                System.out.println("deadlock : " + info.getBlockedTime());
                StackTraceElement[] stack = info.getStackTrace();
                for(StackTraceElement ste:stack) {
                    System.out.println(ste.getLineNumber());
                }
            }
        }
    }

    @Test
    public void closure() {
        int a = 5;
        consume(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(a);
            }
        });
    }

    private void consume(java.util.function.Consumer consumer) {
    }

    @Test
    public void linkedHashMap() {
        Map<String, String> map = new LinkedHashMap<>(100, 0.75F, true);
        map.put("a", "a1");
        map.put("b", "b1");
        map.put("c", "c1");
        map.put("d", "d1");
        map.put("e", "e1");
        map.put("f", "f1");
        map.put("g", "g1");

        assertThat(map.toString(), is("{a=a1, b=b1, c=c1, d=d1, e=e1, f=f1, g=g1}"));
        map.get("f");
        assertThat(map.toString(), is("{a=a1, b=b1, c=c1, d=d1, e=e1, g=g1, f=f1}"));
        map.get("b");
        assertThat(map.toString(), is("{a=a1, c=c1, d=d1, e=e1, g=g1, f=f1, b=b1}"));
        map.get("a");
        assertThat(map.toString(), is("{c=c1, d=d1, e=e1, g=g1, f=f1, b=b1, a=a1}"));
        map.remove("d");
        assertThat(map.toString(), is("{c=c1, e=e1, g=g1, f=f1, b=b1, a=a1}"));
        map.put("d", "d1");
        assertThat(map.toString(), is("{c=c1, e=e1, g=g1, f=f1, b=b1, a=a1, d=d1}"));

        Map<String, String> map2 = new LinkedHashMap<>(100, 0.75F, false);
        map2.put("a", "a1");
        map2.put("b", "b1");
        map2.put("c", "c1");
        map2.put("d", "d1");
        map2.put("e", "e1");
        map2.put("f", "f1");
        map2.put("g", "g1");

        assertThat(map2.toString(), is("{a=a1, b=b1, c=c1, d=d1, e=e1, f=f1, g=g1}"));
        map2.get("f");
        assertThat(map2.toString(), is("{a=a1, b=b1, c=c1, d=d1, e=e1, f=f1, g=g1}"));
        map2.get("b");
        assertThat(map2.toString(), is("{a=a1, b=b1, c=c1, d=d1, e=e1, f=f1, g=g1}"));
        map2.get("a");
        assertThat(map2.toString(), is("{a=a1, b=b1, c=c1, d=d1, e=e1, f=f1, g=g1}"));
        map2.remove("d");
        assertThat(map2.toString(), is("{a=a1, b=b1, c=c1, e=e1, f=f1, g=g1}"));
        map2.put("d", "d1");
        assertThat(map2.toString(), is("{a=a1, b=b1, c=c1, e=e1, f=f1, g=g1, d=d1}"));
    }

    @Test
    public void phaser() {

    }

    @Test
    public void testDouble() {
        double a = 123.45D;
        double b = 1.11D;
        double c = 1.13D;
        System.out.println(a);
        System.out.println(a + 5);
        System.out.println(a + 0.5);
        System.out.println(a + 0.54);
        System.out.println(b * 5);
        System.out.println(c * 5);
        System.out.println(c / 5);
        double d = c / 5;
        System.out.println(d * 5);
        System.out.println(0.22599999999999998D * 5);

        System.out.println(new BigDecimal(d, MathContext.DECIMAL32));
//bit 31   30 - 23   22 - 0
//     0   01111111  00000000000000000000000 //positive number so the sign bit is not specified
        System.out.println(Integer.toBinaryString(Float.floatToRawIntBits(1F)));
//bit 31   30 - 23   22 - 0
//     1   01111111  00000000000000000000000 //negative number so the sign bit is set to 10
        System.out.println(Integer.toBinaryString(Float.floatToRawIntBits(-1F)));
//bit 31   30 - 23   22 - 0
//     0   10000000  00000000000000000000000
        System.out.println(Integer.toBinaryString(Float.floatToRawIntBits(2F)));
//bit 31   30 - 23   22 - 0
//     1   10000000  00000000000000000000000
        System.out.println(Integer.toBinaryString(Float.floatToRawIntBits(-2F)));
        System.out.println(Integer.toBinaryString(2));
        System.out.println(Integer.toBinaryString(Float.floatToRawIntBits(0F)));
        System.out.println(Long.toBinaryString(Double.doubleToRawLongBits(1D)));
    }
}
