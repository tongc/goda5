package com.goda5.hagendaz.common.paxos;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

/**
 * accepts {@link Proposal} and send back {@link Promise}
 */
class Acceptor implements Node {
    private final int id;
    private final EventBus eventBus = new EventBus();
    private volatile Proposal accepted = null;

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

    private void promise(Proposal proposal) {
        if(accepted != null) {
            if(accepted.getVersion() < proposal.getVersion()) {
                eventBus.post(new Promise(accepted));
            }
        } else {
            accepted = proposal;
            eventBus.post(new Promise(proposal));
        }
    }
}
