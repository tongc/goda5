package com.goda5.hagendaz.common.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Node {
	private UnitOfWork uow;
	
	private List<Node> pats;
	
	private Map<Node, Boolean> msgReceived = new HashMap<Node, Boolean>();
	
	public Node(UnitOfWork uow) {
		this.uow = uow;
	}
	
	private Status status = Status.INIT;
	private Role role = Role.PARTICIPANT;
	
	public void discardMsg(Message msg) {
		System.out.println(msg + " discarded");
	}

	public Message processMsg(Node from, Message msg) {
		System.out.println(msg);
		switch (role) {
		case PARTICIPANT:
			switch (status) {
			case COMMIT: case ABORT:
				discardMsg(msg);
				break;
			case WAITING:
				switch(msg) {
				case CANCOMMIT:
					break;
				case YES:
					break;
				case PRECOMMIT:
					break;
				case ACK:
					break;
				case DOCOMMIT:
					break;
				case HAVECOMMITTED:
					break;
				}
				break;
			case INIT:
				switch(msg) {
				case CANCOMMIT:
					return Message.YES;
				case YES:
					break;
				case PRECOMMIT:
					break;
				case ACK:
					break;
				case DOCOMMIT:
					break;
				case HAVECOMMITTED:
					break;
				}
				break;
			}
			break;
		case COORDINATOR:
			switch (status) {
			case COMMIT: case ABORT:
				discardMsg(msg);
				break;
			case WAITING:
				switch(msg) {
				case CANCOMMIT:
					break;
				case YES:
					msgReceived.put(from, true);
					if(allMsgReceived()) {
						initMsgReceived();
						return Message.PRECOMMIT;
					}
					break;
				case PRECOMMIT:
					break;
				case ACK:
					break;
				case DOCOMMIT:
					break;
				case HAVECOMMITTED:
					break;
				}
				break;
			case INIT:
				break;
			}
			break;
		}
		return null;
	}
	
	public boolean allMsgReceived() {
		for(Node node:msgReceived.keySet()) {
			if(!msgReceived.get(node)) {
				return false;
			}
		}
		return true;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<Node> getPats() {
		return pats;
	}

	public void setPats(List<Node> pats) {
		this.pats = pats;
	}
	
	public void initMsgReceived() {
		msgReceived.clear();
		for(Node node:pats) {
			msgReceived.put(node, false);
		}
	}
}
