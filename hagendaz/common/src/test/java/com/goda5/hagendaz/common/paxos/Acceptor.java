package com.goda5.hagendaz.common.paxos;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;

/**
 * accepts {@link Proposal} and send back {@link Promise}
 */
class Acceptor implements Node {
    private final int id;
    private final EventBus eventBus = new EventBus();
    private volatile Proposal previouslyAcceptedProposal = null;

    Acceptor(int id) {
        this.id = id;
    }

    void registerQuorum(Proposer proposer) {
        eventBus.register(proposer);
    }

    @Subscribe
    public void receivePrepare(Proposal proposal) {
        System.out.printf("Acceptor %s received proposal from Proposer %s with version %s\n", id, proposal.getProposer().getId(), proposal.getVersion());
        sendPromise(proposal);
    }

    private synchronized void sendPromise(Proposal newProposal) {
        if(alreadyAcceptedPreviousProposal()) {
            if(previousProposalsVersionIsEarlier(newProposal)) {
                replyNewProposerWith(promiseOf(previouslyAcceptedProposal));
                System.out.printf("replied promise using previously accepted proposal\n");
            }
        } else {
            previouslyAcceptedProposal = newProposal;
            replyNewProposerWith(promiseOf(newProposal));
            System.out.printf("replied promise using new proposal\n");
        }
    }

    @NotNull
    private Promise promiseOf(Proposal accepted) {
        return new Promise(accepted, this);
    }

    private void replyNewProposerWith(Promise event) {
        eventBus.post(event);
    }

    private boolean previousProposalsVersionIsEarlier(Proposal proposal) {
        return previouslyAcceptedProposal.getVersion() < proposal.getVersion();
    }

    private boolean alreadyAcceptedPreviousProposal() {
        return previouslyAcceptedProposal != null;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Acceptor{" +
                "id=" + id +
                ", eventBus=" + eventBus +
                ", previouslyAcceptedProposal=" + previouslyAcceptedProposal +
                '}';
    }
}
