package com.goda5.hagendaz.common;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;

/**
 * Created by tong on 12/04/2016.
 */
public class GuavaCache {
    @Test
    public void testNormalCache() {
        NormalCache cache = new NormalCache();
        Function<Integer, Object> expensiveOperation = this::expensiveOperation;
        benchmark(o -> cache.execute(expensiveOperation, 1), 1);
        benchmark(o -> cache.execute(expensiveOperation, 1), 1);
        benchmark(o -> cache.execute(expensiveOperation, 1), 1);
    }

    private class NormalCache {
        ConcurrentMap<Integer, Object> cacheHolder = Maps.newConcurrentMap();
        Object execute(Function<Integer, Object> func1, Integer key) {
            if(!cacheHolder.containsKey(key)) {
                Object result = func1.apply(key);
                cacheHolder.put(key, result);
                return result;
            } else {
                return cacheHolder.get(key);
            }
        }
    }

    @Test
    public void testGuavaCache() throws ExecutionException {
        LoadingCache<Integer, Object> graphs = CacheBuilder.newBuilder()
                .maximumSize(1000)
                .build(
                        new CacheLoader<Integer, Object>() {
                            public Object load(Integer key) {
                                return expensiveOperation(key);
                            }
                        });

        benchmark(o -> graphs.getUnchecked((Integer)o), 1);
        benchmark(o -> graphs.getUnchecked((Integer)o), 1);
        benchmark(o -> graphs.getUnchecked((Integer)o), 1);
        benchmark(o -> graphs.getUnchecked((Integer)o), 1);
    }

    private void benchmark(java.util.function.Consumer<Object> consumer, Object parameter) {
        long start = System.currentTimeMillis();
        consumer.accept(parameter);
        long end = System.currentTimeMillis();
        System.out.printf("time taken: %s\n", end - start);
    }

    private Object expensiveOperation(Integer key) {
        //nothing is more expensive than sleep.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return ThreadLocalRandom.current().nextInt(100);
    }
}
