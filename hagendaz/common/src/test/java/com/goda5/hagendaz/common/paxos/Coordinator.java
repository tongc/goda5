package com.goda5.hagendaz.common.paxos;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by tong on 20/03/2016.
 */
public class Coordinator {
    public static void main(String[] args) throws InterruptedException {
        List<Acceptor> acceptors = new CopyOnWriteArrayList<>();
        acceptors.add(new Acceptor(1));
        acceptors.add(new Acceptor(2));
        acceptors.add(new Acceptor(3));

        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        for(int i=0;i<100;i++) {
            executorService.execute(generateRunnable(i, acceptors));
        }
        executorService.shutdown();
        executorService.awaitTermination(3, TimeUnit.SECONDS);
    }

    private static Runnable generateRunnable(int id, List<Acceptor> acceptors) {
        return () -> {
            Proposer proposer = new Proposer(id, acceptors);
            acceptors.forEach(eachAcceptor -> eachAcceptor.registerQuorum(proposer));
            proposer.propose();
        };
    }
}
