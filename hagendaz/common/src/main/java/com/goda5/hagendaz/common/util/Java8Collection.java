package com.goda5.hagendaz.common.util;

import com.google.common.collect.Sets;

import java.lang.reflect.Executable;
import java.util.List;
import java.util.Map;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

/**
 * Created by tong on 24/06/2015.
 */
public class Java8Collection {
    public static void main(String[] args) {
        Map<Boolean, List<String>> passingFailing =
                Sets.<String>newHashSet("abc", "def").stream()
                        .collect(Collectors.partitioningBy(s -> s.length() >= 1));

        ToIntFunction<String> a = x -> x.length() * x.length();
        ToIntFunction<String> b = x -> 5*6;

        System.out.println(Sets.<String>newHashSet("abc", "def", "ccc", "zz", "dss").stream()
                .collect(groupingBy(x -> "abc", Collectors.summarizingInt(a))));
    }

    public static <E> E[] appendToArray(E[] array, E item) {
        E[] result = (E[])new Object[array.length+1];
        result[array.length] = item;
        return result;
    }
}
