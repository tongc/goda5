package com.goda5.hagendaz.common.util;

class Solution {
    public int solution(int[] A) {
    	for(int i=0;i<A.length;i++) {
    		System.out.println(i);
    		if(i == 5)
    			continue;
    		System.out.println(i);
    	}
    	return A.length;
    }
    
    private int count(int[] A) {
        int count = 0;
        for(int i=1;i<A.length;i++) { 
            if(A[i-1]==A[i]) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
    	Solution s = new Solution();
    	int[] a = new int[8];
    	a[0] = 1;
    	a[1] = 1;
    	a[2] = 0;
    	a[3] = 1;
    	a[4] = 0;
    	a[5] = 0;
    	a[6] = 1;
    	a[7] = 1;
    	System.out.println(s.solution(a));
    }
}
