package com.goda5.hagendaz.common;

import org.junit.Test;

/**
 * Created by tong on 08/03/2016.
 */
public class Fibon {
    volatile int start = 1;
    volatile int previous = 0;
    final int until = 10000;
    @Test
    public void loop() {
        while(start < until) {
            int temp = start;
            start += previous;
            previous = temp;
            System.out.println(start);
        }
    }

    @Test
    public void recur() {
        System.out.println(recur(20));
    }

    private int recur(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        else {
            return recur(n - 1) + recur(n - 2);
        }
    }

//    f(0) 0
//    f(1) 1
//    f(2) 2
//    f(3) 3
//    f(4) 5
//
//    f(n) = f(n-1) + f(n-2)
    //f(n+2) = f(n) + f(n+1)

    @Test
    public void tailRecur() {
        tailRecur(0, 1);
    }

    private int tailRecur(int previous, int current) {
        if(current > 10000) return 0;
        System.out.println(current);
        return tailRecur(current + previous, previous);
    }
}
