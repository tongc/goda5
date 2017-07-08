package com.goda5.hagendaz.common;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.function.Consumer;

import static java.util.stream.Collectors.toList;

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
        CompletableFuture<Object> anotherFuture = completableFuture.thenApply((Function<Object, Object>) o -> "applied");
        boolean complete = completableFuture.complete("NOT completed");
        System.out.println(complete);
        boolean complete1 = completableFuture1.complete("NOT complete");
        System.out.println(complete1);
        executorService.shutdown();
        executorService.awaitTermination(3000, TimeUnit.SECONDS);


        CompletableFuture<String> something = CompletableFuture.supplyAsync(() -> {
            System.out.println("ccc");
            throw new RuntimeException("xxx");
        });
//        something.completeExceptionally(new RuntimeException("aaa"));
//        System.out.println(something.get());


        List<CompletableFuture<String>> results = Lists.newArrayList(get1(), get1(), get1());
        List<String> collect = results.stream().map(stringCompletableFuture -> {
            try {
                return stringCompletableFuture.get();
            } catch (Exception ex) {
                return ex.getMessage() + "vvvvv";
            }
        }).collect(toList());
        System.out.println(collect);
    }

    private static CompletableFuture<String> get1() {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            throw new RuntimeException("xxx");
        });
    }
}
