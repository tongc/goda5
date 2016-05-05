package com.goda5.hagendaz.common;

import java.util.concurrent.*;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by tong on 05/05/2016.
 */
public class CompletableFutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CompletableFuture<Object> completableFuture = CompletableFuture.supplyAsync(new Supplier<Object>() {
            @Override
            public Object get() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return "completed";
            }
        });
        CompletableFuture<Object> completableFuture1 = CompletableFuture.supplyAsync((Supplier<Object>) () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "completed 2";}, executorService);
//        System.out.println(completableFuture.get());
        completableFuture.thenApply((Function<Object, Object>) o -> "applied");
        boolean complete = completableFuture.complete("NOT completed");
        System.out.println(complete);
        boolean complete1 = completableFuture1.complete("NOT complete");
        System.out.println(complete1);
        executorService.shutdown();
        executorService.awaitTermination(3000, TimeUnit.SECONDS);
    }
}
