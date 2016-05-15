package com.goda5.hagendaz.common;

import java.util.concurrent.*;

/**
 * Created by tong on 15/05/2016.
 */
public class ExecutorServiceVsCompletionServiceTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ExecutorCompletionService<Object> executorCompletionService = new ExecutorCompletionService<>(executorService);
        Future<Object> submit = executorService.submit(() -> ThreadLocalRandom.current().nextInt());
        Future<Integer> submit2 = executorService.submit(() -> ThreadLocalRandom.current().nextInt());
        Future<Integer> submit3 = executorService.submit(() -> ThreadLocalRandom.current().nextInt());
        Future<Integer> submit4 = executorService.submit(() -> ThreadLocalRandom.current().nextInt());
        Future<Integer> submit5 = executorService.submit(() -> ThreadLocalRandom.current().nextInt());

        executorCompletionService.submit(() -> {
            try {
                Thread.sleep(3000);
                return ThreadLocalRandom.current().nextInt();
            } catch(Exception ex) {
                ex.printStackTrace();
            }
            return 0;
        });
        executorCompletionService.submit(() -> {
            try {
                while(true) {
                    if(Thread.interrupted()) {
                        System.out.println("interrupted");
                        break;
                    }
                }
            } catch(Exception ex) {
                ex.printStackTrace();
            }
            return ThreadLocalRandom.current().nextInt();
        });
        executorCompletionService.submit(() -> ThreadLocalRandom.current().nextInt());
        executorCompletionService.submit(() -> ThreadLocalRandom.current().nextInt());
        executorCompletionService.submit(() -> ThreadLocalRandom.current().nextInt());
//        System.out.println(executorCompletionService.take().get());
//        System.out.println(executorCompletionService.take().get());
//        System.out.println(executorCompletionService.take().get());
//        System.out.println(executorCompletionService.take().get());
//        System.out.println(executorCompletionService.take().get());

        executorService.shutdown();
        try {
            if(!executorService.awaitTermination(1, TimeUnit.SECONDS)) {
                System.out.println("stilllllll");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
