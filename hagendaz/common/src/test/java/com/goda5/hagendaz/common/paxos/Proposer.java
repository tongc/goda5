package com.goda5.hagendaz.common.paxos;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import org.apache.commons.lang.math.RandomUtils;

import java.util.List;

/**
 * who starts the Paxos process by sending a {@link Proposal} to a Quorum of {@link Acceptor}s
 */
class Proposer implements Node, Coordinator {
    private final EventBus eventBus = new EventBus();
    private final List<Acceptor> acceptors;
    private final int id;

    Proposer(int id, List<Acceptor> acceptors) {
        this.id = id;
        this.acceptors = acceptors;
        this.acceptors.forEach(eventBus::register);
    }

    void prepare() {
        eventBus.post(new Proposal(this, System.nanoTime(), RandomUtils.nextInt(10000)));
    }

    @Subscribe
    public void receivePromise(Promise promise) {

    }

    @Override
    public String toString() {
        return "Proposer{" +
                "id=" + id +
                '}';
    }
}
