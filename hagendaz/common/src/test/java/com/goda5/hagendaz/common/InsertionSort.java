package com.goda5.hagendaz.common;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        new InsertionSort().sort(new Integer[]{3,2,5,8,7,1,90,0,-10,100});
    }

    public Integer[] sort(Integer[] input) {
        System.out.println("before" + Arrays.asList(input));
        for(int i=1;i<input.length;i++) {
            for(int j=i-1;j>=0;j--) {
                if(input[j+1] < input[j]) {
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                } else {
                    break;
                }
            }
        }
        System.out.println("after" + Arrays.asList(input));
        return input;
    }
}
