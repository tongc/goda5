package com.goda5.hagendaz.common;


import com.google.common.collect.Sets;

import java.util.Set;

public class MissingNum {
    public static void main(String[] args) {
        Set<Integer> tracker = Sets.newHashSet();
        int[] input = new int[]{1, 8, 4, 3, 2, 5, 7, 10, 6, 9, 13, 11};
        for (int i = 0; i < input.length; i++) {
            int comp = input.length + 2 - input[i];
            if (tracker.contains(comp)) {
                tracker.remove(comp);
            } else {
                tracker.add(input[i]);
            }
        }
        System.out.println(input.length + 2 - tracker.iterator().next());

        int sum = (input.length + 1 + 1)*(input.length+1)/2;
        for(int i=0;i<input.length;i++) {
            sum -= input[i];
        }
        System.out.println(sum);
    }
}
