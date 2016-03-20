package com.goda5.hagendaz.common.paxos;

/**
 * Created by tong on 20/03/2016.
 */
public class Proposal {
    private final long version;
    private final Object value;
    private final Proposer proposer;

    public Proposal(Proposer proposer, long version, Object value) {
        this.proposer = proposer;
        this.version = version;
        this.value = value;
    }

    public long getVersion() {
        return version;
    }

    public Object getValue() {
        return value;
    }

    public Proposer getProposer() {
        return proposer;
    }

    @Override
    public String toString() {
        return "Proposal{" +
                "version=" + version +
                ", value=" + value +
                ", proposer=" + proposer +
                '}';
    }
}
