package com.goda5.hagendaz.common;

import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by tong on 21/02/2017.
 */
public class CurryingTest {
    @Test
    public void curry() {
        Function<Integer, Function<Integer, Function<Integer, Integer>>> func1 = (val) -> {
            Function<Integer, Function<Integer, Integer>> func2 = (val2) -> {
                Function<Integer, Integer> func3 = (val3) -> {
                    return val + val2 + val3;
                };
                return func3;
            };
            return func2;
        };
        System.out.println(func1.apply(1).apply(2).apply(3));
    }
}
