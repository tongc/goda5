package com.goda5.hagendaz.common.paxos;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * To direct everything in Paxos process.
 * Paxos is basically a protocol to get consensus from all interconnected nodes in order to let every node sets the same value.
 * for more info @see <a href="https://en.wikipedia.org/wiki/Paxos_(computer_science)#Basic_Paxos">Paxos</a>
 <pre>
 Basic Paxos

 Client   Proposer      Acceptor     Learner
 |           |           |  |  |       |  |
 X---------->|           |  |  |       |  |  Request
 |           X---------->|->|->|       |  |  Prepare(1)
 |           |<----------X--X--X       |  |  Promise(1,{Va,Vb,Vc})
 |           X---------->|->|->|       |  |  Accept!(1,Vn)
 |           |<----------X--X--X------>|->|  Accepted(1,Vn)
 |<------------------------------------X--X  Response
 |           |           |  |  |       |  |
 </pre>
 */
public class Director {
    public static void main(String[] args) throws InterruptedException {
        List<Acceptor> acceptors = new CopyOnWriteArrayList<>();
        acceptors.add(new Acceptor(1));
        acceptors.add(new Acceptor(2));
        acceptors.add(new Acceptor(3));

        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        for(int i=0;i<30;i++) {
            executorService.execute(generateRunnable(i, acceptors));
        }
        executorService.shutdown();
        executorService.awaitTermination(3, TimeUnit.SECONDS);
    }

    private static Runnable generateRunnable(int id, List<Acceptor> acceptors) {
        return () -> {
            Proposer proposer = new Proposer(id, acceptors);
            acceptors.forEach(eachAcceptor -> eachAcceptor.registerQuorum(proposer));
            proposer.prepare();
        };
    }
}
