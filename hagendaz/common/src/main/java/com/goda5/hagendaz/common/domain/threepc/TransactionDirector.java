package com.goda5.hagendaz.common.domain.threepc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.commons.lang.math.RandomUtils;

import com.goda5.hagendaz.common.domain.other.Message;
import com.goda5.hagendaz.common.domain.other.Node;
import com.goda5.hagendaz.common.domain.other.Role;
import com.goda5.hagendaz.common.domain.other.UnitOfWork;

public class TransactionDirector {
	private TransactionNetwork network = new TransactionNetwork();
	private List<Node> pats = new ArrayList<Node>();
	private Node coordinator = null;

	public TransactionDirector(int numOfPats) {
		for (int i = 0; i < numOfPats; i++) {
			UnitOfWork uow = new UnitOfWork();
			Node pat = new Node(uow);
			pats.add(pat);
		}
	}

	public Node vote() {
		Node node = pats.get(RandomUtils.nextInt(pats.size()));
		node.setRole(Role.COORDINATOR);
		coordinator = node;
		pats.remove(node);
		node.setPats(pats);
		return node;
	}

	public void tryCommit() throws InterruptedException, ExecutionException {
		ExecutorService es = (ExecutorService) Executors.newFixedThreadPool(1);
		List<Callable<List<Message>>> calls = new ArrayList<Callable<List<Message>>>();
		Callable<List<Message>> c = new Callable<List<Message>>() {
			@Override
			public List<Message> call() throws Exception {
				return network.sendMsg(Message.CANCOMMIT, coordinator, pats);
			}
		};
		calls.add(c);
		List<Future<List<Message>>> futures = es.invokeAll(calls);
		for (Future<List<Message>> future : futures) {
			System.out.println(future.get());
		}

		// es.awaitTermination(5, TimeUnit.SECONDS);
		es.shutdown();
	}
}
