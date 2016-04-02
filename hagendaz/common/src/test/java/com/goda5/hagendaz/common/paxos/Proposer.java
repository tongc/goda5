package com.goda5.hagendaz.common.paxos;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import org.apache.commons.lang.math.RandomUtils;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

/**
 * who starts the Paxos process by sending a {@link Proposal} to a Quorum of {@link Acceptor}s
 */
class Proposer implements Node, Coordinator {
    private final EventBus eventBus = new EventBus();
    private final List<Acceptor> acceptors;
    private final List<Promise> receivedPromises = new CopyOnWriteArrayList<>();
    private final int id;

    Proposer(int id, List<Acceptor> acceptors) {
        this.id = id;
        this.acceptors = acceptors;
        this.acceptors.forEach(eventBus::register);
    }

    void prepare() {
        //System.nanoTime() + RandomUtils.nextInt(100000000) to simulate the bad version (old version) being received
        Proposal proposal = new Proposal(this, System.nanoTime() + RandomUtils.nextInt(100000000), RandomUtils.nextInt(10000));
        acceptors.stream().forEach(eachAcceptor -> eachAcceptor.receivePrepare(proposal));
    }

    @Subscribe
    public void receivePromise(Promise promise) {
        if(isMajorityAcceptorsHaveSentPromisesBack()) {
            System.out.printf("Consensus formed from %s\n",
                    receivedPromises
                            .stream()
                            .map(
                                    eachPromise ->
                                            String.valueOf(eachPromise.getAcceptor().getId()))
                            .collect(Collectors.joining(", ")));
            receivedPromises.clear();
        } else {
            receivedPromises.add(promise);
        }
        System.out.printf("Proposer %s received promise version %s from Acceptor %s\n", id, promise.getProposal().getVersion(), promise.getAcceptor().getId());
    }

    private boolean isMajorityAcceptorsHaveSentPromisesBack() {
        return receivedPromises.size() >= acceptors.size()/2 + 1;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Proposer{" +
                "id=" + id +
                '}';
    }
}
