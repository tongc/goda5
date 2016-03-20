package com.goda5.hagendaz.common.paxos;

import java.util.List;

/**
 * Created by tong on 20/03/2016.
 */
public class Promise {
    private final Proposal current;
    private final List<Proposal> previous;

    public Promise(Proposal current, List<Proposal> previous) {
        this.current = current;
        this.previous = previous;
    }
}
