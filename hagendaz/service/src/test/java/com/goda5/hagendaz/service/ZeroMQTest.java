package com.goda5.hagendaz.service;

import org.testng.annotations.Test;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.UntypedActor;

public class ZeroMQTest {
	@Test
	public void testServer() {
		ActorSystem system = ActorSystem.create("MySystem");
		ActorRef myActor = system.actorOf(new Props(null, AkkaActor.class, null), "myActor");
		myActor.tell("test", myActor);
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
