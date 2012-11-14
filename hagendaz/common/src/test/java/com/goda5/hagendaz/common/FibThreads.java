package com.goda5.hagendaz.common;

import java.util.concurrent.atomic.AtomicLong;

public class FibThreads {

    private static AtomicLong cnt = new AtomicLong(0);
   
    public static int fib(final int n) throws InterruptedException {
    	System.out.println("now: " + n);
        if (n < 2) {
            return n;
        } else {
            final int[] t1 = {0}, t2 = {0};

            Thread thread1 = new Thread() {
                {cnt.incrementAndGet();}
                public void run() {
                    try {
                        t1[0] = fib(n - 1);
                    } catch (InterruptedException ex) {
                    }
                }
            };

            Thread thread2 = new Thread() {
                {cnt.incrementAndGet();}
                public void run() {
                    try {
                        t2[0] = fib(n - 2);
                    } catch (InterruptedException ex) { }
                }
            };

            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();

            return t1[0] + t2[0];
        }
    }
    
    public static int fib2(final int n) throws InterruptedException {
    	//System.out.println("aaa: " + n);
    	if(n<2) {
    		return n;
    	}
    	System.out.println((n-1) + ":" + (n-2));
    	int a = fib2(n-1) + fib2(n-2);
    	return a;
    }
    
    public static int fib3(int n) {
    	int previous = 1;
    	int next = 2;
    	
    	for(int i=3;i<n;i++) {
    		int tmp = next;
    		next += previous;
    		previous = tmp;
    	}
    	
    	return next;
    }
    
    // Run on Mac
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        //System.out.println(fib(7));
        long end = System.currentTimeMillis();
        
        System.out.println("Elapsed: " + (end - start));
        System.out.println("Number of threads: " + cnt);
        
        System.out.println(fib2(7));
        
        System.out.println("fib3: " + fib3(7));
    }
}