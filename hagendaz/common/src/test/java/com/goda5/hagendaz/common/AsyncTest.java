package com.goda5.hagendaz.common;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.concurrent.*;
import java.util.stream.IntStream;

import static org.junit.Assert.assertTrue;

/**
 * Created by tong on 21/02/2017.
 */
public class AsyncTest {
    @Test
    public void completionService() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        long start = System.currentTimeMillis();
        CompletionService<Object> completionService = new ExecutorCompletionService<>(executorService);
        completionService.submit(() -> {
            Thread.sleep(3000);
            System.out.println("test");
            return System.currentTimeMillis();
        });
        completionService.submit(() -> {
            Thread.sleep(3000);
            System.out.println("test");
            return System.currentTimeMillis();
        });
        completionService.submit(() -> {
            Thread.sleep(3000);
            System.out.println("test");
            return System.currentTimeMillis();
        });
        IntStream.range(0, 3).forEach(value -> {
            try {
                Future<Object> take = completionService.take();
                System.out.println(take.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });
        long end = System.currentTimeMillis();
        BigDecimal val = new BigDecimal(end - start).divide(BigDecimal.valueOf(1000L), BigDecimal.ROUND_HALF_UP);
        assertTrue(val.compareTo(BigDecimal.valueOf(3)) >= 0 && val.compareTo(BigDecimal.valueOf(9)) < 0);
    }

    @Test
    public void completableFuture() throws InterruptedException {
        CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "value is " + System.currentTimeMillis();
        }).thenAccept(System.out::println);
        Thread.sleep(5000);
    }
}
