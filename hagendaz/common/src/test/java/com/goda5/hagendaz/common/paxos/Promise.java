package com.goda5.hagendaz.common.paxos;

import java.util.List;

/**
 * {@link Acceptor} letting {@link Proposer} know that it has accepted
 * the {@link Proposal} the {@link Proposer} sent.
 */
public class Promise {
    private final Proposal current;
    private final List<Proposal> previous;

    public Promise(Proposal current, List<Proposal> previous) {
        this.current = current;
        this.previous = previous;
    }
}
