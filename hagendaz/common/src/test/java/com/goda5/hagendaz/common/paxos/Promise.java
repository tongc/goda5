package com.goda5.hagendaz.common.paxos;

/**
 * {@link Acceptor} letting {@link Proposer} know that it has accepted
 * the {@link Proposal} the {@link Proposer} sent.
 */
public class Promise {
    private final Proposal accepted;
    private final Acceptor acceptor;

    Promise(Proposal accepted, Acceptor acceptor) {
        this.accepted = accepted;
        this.acceptor = acceptor;
    }

    public Acceptor getAcceptor() {
        return acceptor;
    }
}
