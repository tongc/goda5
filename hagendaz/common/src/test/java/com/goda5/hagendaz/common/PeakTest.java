package com.goda5.hagendaz.common;

import com.google.common.collect.Lists;
import edu.emory.mathcs.backport.java.util.Collections;
import org.junit.Test;

import java.util.List;

public class PeakTest {
    List<Integer> array = Lists.newArrayList(2, 3, 4, 1, 7, 8, 10, 20, 5, 9);
    List<List<Integer>> array2D = Lists.newArrayList(
            Lists.newArrayList(2, 3, 4, 1, 7, 8, 10, 20, 5, 9),
            Lists.newArrayList(2, 3, 4, 1, 7, 8, 10, 20, 5, 9),
            Lists.newArrayList(2, 3, 4, 1, 80, 8, 10, 20, 5, 9),
            Lists.newArrayList(2, 3, 4, 1, 7, 8, 10, 40, 5, 9),
            Lists.newArrayList(2, 3, 4, 1, 7, 8, 10, 20, 5, 9)
    );


    public Integer oneDPeak(List<Integer> values) {
        if (values.get(values.size() / 2) < values.get(values.size() / 2 + 1)) {
            return oneDPeak(values.subList(values.size() / 2, values.size()));
        } else if (values.get(values.size() / 2) < values.get(values.size() / 2 - 1)) {
            return oneDPeak(values.subList(0, values.size() / 2));
        } else {
            return values.get(values.size() / 2);
        }
    }

    public Integer twoDPeak(List<List<Integer>> values) {
        int idx = maxIdx(values.get(values.size()/2));
        List<Integer> newList = Lists.newArrayList();
        for(int i=0;i<values.size();i++) {
            newList.add(values.get(i).get(idx));
        }
        return oneDPeak(newList);
    }

    private Integer maxIdx(List<Integer> values) {
        int idx = 0;
        int max = values.get(idx);
        for(int i=0;i<values.size();i++) {
            if(values.get(i) > max) {
                max = values.get(i);
                idx = i;
            }
        }
        return idx;
    }

    @Test
    public void testOneD() {
        System.out.println(new PeakTest().oneDPeak(array));
    }

    @Test
    public void testTwoD() {
        System.out.println(new PeakTest().twoDPeak(array2D));
    }
}
