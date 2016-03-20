package com.goda5.hagendaz.common.paxos;

import java.util.List;

/**
 * {@link Acceptor} letting {@link Proposer} know that it has accepted
 * the {@link Proposal} the {@link Proposer} sent.
 */
public class Promise {
    private final Proposal accepted;

    public Promise(Proposal accepted) {
        this.accepted = accepted;
    }
}
