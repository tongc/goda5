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
        System.out.printf("%s received %s \n", id, proposal);
        promise(proposal);
    }

    private void promise(Proposal newProposal) {
        if(alreadyAcceptedPreviousProposal()) {
            if(previousProposalsVersionIsEarlier(newProposal)) {
                replyNewProposerWith(promiseOf(previouslyAcceptedProposal));
            }
        } else {
            previouslyAcceptedProposal = newProposal;
            replyNewProposerWith(promiseOf(newProposal));
        }
    }

    @NotNull
    private Promise promiseOf(Proposal accepted) {
        return new Promise(accepted);
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
}
