package com.goda5.hagendaz.common;

import org.apache.commons.lang3.tuple.Pair;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new MergeSort().mergeSort(new int[]{2,3,4,1})).mapToObj(String::valueOf).collect(Collectors.joining(",")));

        System.out.println(Arrays.stream(new MergeSort().mergeSort(new int[]{3,4,4,2,3,4,1})).mapToObj(String::valueOf).collect(Collectors.joining(",")));

        System.out.println(Arrays.stream(new MergeSort().merge(new int[]{2,3}, new int[]{4,1})).mapToObj(String::valueOf).collect(Collectors.joining(",")));
        System.out.println("\n\n\n");
        new MergeSort().splitIfMoreThan2(new int[]{2,3,4,1}).ifPresent(pair -> {
            Arrays.stream(pair.getKey()).forEach(System.out::println);
            System.out.println("\n");
            Arrays.stream(pair.getValue()).forEach(System.out::println);
        });
    }

    public int[] mergeSort(int[] input) {
        Optional<Pair<int[], int[]>> split = splitIfMoreThan2(input);
        if (split.isPresent()) {
            return merge(mergeSort(split.get().getLeft()), mergeSort(split.get().getRight()));
        } else {
            return input;
        }
    }

    public Optional<Pair<int[], int[]>> splitIfMoreThan2(int[] input) {
        if (input.length >= 2) {
            int switchWhen = input.length / 2;
            int[] result1 = new int[switchWhen];
            int[] result2 = new int[input.length - switchWhen];
            for (int i = 0; i < switchWhen; i++) {
                result1[i] = input[i];
            }
            for (int i = switchWhen, j = 0; i < input.length; i++, j++) {
                result2[j] = input[i];
            }
            return Optional.of(Pair.of(result1, result2));
        } else {
            return Optional.empty();
        }
    }

    /**
     * @param i1 assume is sorted
     * @param i2 assume is sorted
     */
    public int[] merge(int[] i1, int[] i2) {
        int result[] = new int[i1.length + i2.length];
        int i1Idx = 0;
        int i2Idx = 0;
        int resultIdx = 0;
        while (i1Idx < i1.length || i2Idx < i2.length) {
            if (i1Idx < i1.length && i2Idx < i2.length) {
                if (i1[i1Idx] < i2[i2Idx]) {
                    result[resultIdx++] = i1[i1Idx];
                    i1Idx++;
                } else {
                    result[resultIdx++] = i2[i2Idx];
                    i2Idx++;
                }
            } else if (i1Idx < i1.length) {
                result[resultIdx++] = i1[i1Idx];
                i1Idx++;
            } else {
                result[resultIdx++] = i2[i2Idx];
                i2Idx++;
            }
        }
        return result;
    }
}
