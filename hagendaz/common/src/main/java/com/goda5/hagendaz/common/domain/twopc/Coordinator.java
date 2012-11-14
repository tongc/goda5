package com.goda5.hagendaz.common.domain.twopc;

import java.util.ArrayList;
import java.util.List;

public class Coordinator {
	private List<Participant> participants = new ArrayList<Participant>();
	private Transaction t;
	private CoordinatorStatus status;

	public Coordinator(Transaction t, Participant... participants) {
		for(Participant p:participants) {
			this.participants.add(p);
		}
		this.t = t;
	}

	public boolean isCompleted() {
		return status==CoordinatorStatus.ABORTED || status==CoordinatorStatus.COMMITTED;
	}

	public void start() throws InterruptedException {
		status = CoordinatorStatus.READY;
		boolean readyToCommit = true;
		for(Participant p:participants) {
			p.setParticipants(t, participants);
			if(!p.readyToCommit(t)) {
				System.out.println(p + " voted for not commit");
				readyToCommit = false;
			}
		}
		if(readyToCommit) {
			status = CoordinatorStatus.PREPARETOCOMMIT;
			for(Participant p:participants) {
				p.commit(t);
			}
			status = CoordinatorStatus.COMMITTED;
		} else {
			for(Participant p:participants) {
				p.abort(t);
			}
			status = CoordinatorStatus.ABORTED;
		}
	}

}
