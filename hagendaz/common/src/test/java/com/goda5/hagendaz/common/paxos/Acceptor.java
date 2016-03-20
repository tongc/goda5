package com.goda5.hagendaz.common.paxos;

import com.beust.jcommander.internal.Lists;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import edu.emory.mathcs.backport.java.util.Collections;

import java.util.Optional;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * accepts {@link Proposal} and send back {@link Promise}
 */
public class Acceptor {
    private final int id;
    private final EventBus eventBus = new EventBus();
    private final Queue<Proposal> proposals = new ArrayBlockingQueue<>(100);
    private final Queue<Proposal> accepted = new ArrayBlockingQueue<>(50);

    public Acceptor(int id) {
        this.id = id;
    }

    public void registerQuorum(Proposer proposer) {
        eventBus.register(proposer);
    }

    @Subscribe
    public void prepare(Proposal proposal) {
        System.out.printf("%s received %s \n", id, proposal);
        proposals.add(proposal);
        accept(proposal);
    }

    public void accept(Proposal proposal) {
        System.out.printf("existing %s \n", proposals.size());
        Optional<Proposal> anyLarger = proposals.stream().filter(existingProposal -> existingProposal.getVersion() > proposal.getVersion()).findAny();
        if(!anyLarger.isPresent()) {
            if(accepted.size() != 0) {
                eventBus.post(new Promise(proposal, Lists.newArrayList(accepted)));
            } else {
                eventBus.post(new Promise(proposal, Collections.<Proposal>emptyList()));
            }
        } else {
            eventBus.post(new Promise(anyLarger.get(), Collections.<Proposal>emptyList()));
        }
        proposals.remove(proposal);
    }
}
