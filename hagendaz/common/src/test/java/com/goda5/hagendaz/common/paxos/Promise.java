package com.goda5.hagendaz.common.paxos;

/**
 * {@link Acceptor} letting {@link Proposer} know that it has proposal
 * the {@link Proposal} the {@link Proposer} sent.
 */
public class Promise {
    private final Proposal proposal;
    private final Acceptor acceptor;

    Promise(Proposal proposal, Acceptor acceptor) {
        this.proposal = proposal;
        this.acceptor = acceptor;
    }

    public Acceptor getAcceptor() {
        return acceptor;
    }

    public Proposal getProposal() {
        return proposal;
    }
}
