package com.goda5.hagendaz.common.domain.threepc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.goda5.hagendaz.common.domain.Message;
import com.goda5.hagendaz.common.domain.Node;

public class TransactionNetwork {

	public List<Message> sendMsg(final Message msg, final Node from, List<Node> tos) throws InterruptedException, ExecutionException {
		ExecutorService es = (ExecutorService) Executors.newFixedThreadPool(tos.size());
		List<Callable<Message>> calls = new ArrayList<Callable<Message>>();
		for(final Node to:tos) {
			if (from.equals(to)) {
				continue;
			}
			Callable<Message> c = new Callable<Message>() {
				@Override
				public Message call() throws Exception {
					return to.processMsg(from, msg);
				}
			};
			calls.add(c);
		}
		List<Future<Message>> futures = es.invokeAll(calls);
		List<Message> responses = new ArrayList<Message>();
		for(Future<Message> future:futures) {
			responses.add(future.get());
		}
		
		//es.awaitTermination(5, TimeUnit.SECONDS);
		es.shutdown();
		return responses;
	}
}
