package com.goda5.hagendaz.service;

import org.testng.annotations.Test;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.UntypedActor;
import akka.zeromq.ZeroMQExtension;
import akka.zeromq.Bind;

public class ZeroMQTest {
	@Test
	public void testServer() {
		ActorSystem system = ActorSystem.create("MySystem");
		ActorRef myActor = system.actorOf(new Props(AkkaActor.class), "myActor");
		myActor.tell("test");
		//ActorRef pubSocket = ZeroMQExtension.get(system).newPubSocket(new Bind("tcp://127.0.0.1:1237"));
		//pubSocket.tell("test");
	}
	
	public static class AkkaActor extends UntypedActor {
		@Override
		public void onReceive(Object obj) throws Exception {
			System.out.println(obj);
		}
	}
}
