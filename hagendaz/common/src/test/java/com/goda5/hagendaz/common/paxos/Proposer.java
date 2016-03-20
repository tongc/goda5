package com.goda5.hagendaz.common.paxos;

import com.google.common.eventbus.EventBus;
import org.apache.commons.lang.math.RandomUtils;

import java.util.List;

/**
 * who starts the Paxos process by sending a {@link Proposal} to a Quorum of {@link Acceptor}s
 */
public class Proposer {
    private final EventBus eventBus = new EventBus();
    private final List<Acceptor> acceptors;
    private final int id;

    public Proposer(int id, List<Acceptor> acceptors) {
        this.id = id;
        this.acceptors = acceptors;
        this.acceptors.forEach(eventBus::register);
    }

    public void propose() {
        eventBus.post(new Proposal(this, System.nanoTime(), RandomUtils.nextInt(10000)));
    }

    @Override
    public String toString() {
        return "Proposer{" +
                "id=" + id +
                '}';
    }
}
