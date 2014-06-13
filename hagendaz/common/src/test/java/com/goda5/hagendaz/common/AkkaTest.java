package com.goda5.hagendaz.common;

import java.io.Serializable;

import org.testng.annotations.Test;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;

@Test
public class AkkaTest {
	public void testAkka() {
		ActorSystem system = ActorSystem.create("MySystem");
		ActorRef greeter = system.actorOf(new Props(null, null, null));
		greeter.forward(new Greeting("Charlie Parker"), null);
	}

	public class Greeting implements Serializable {
		private static final long serialVersionUID = 1L;
		public final String who;

		public Greeting(String who) {
			this.who = who;
		}
	}

	public class GreetingActor extends UntypedActor {
		LoggingAdapter log = Logging.getLogger(getContext().system(), this);

		public void onReceive(Object message) throws Exception {
			if (message instanceof Greeting)
				log.info("Hello " + ((Greeting) message).who);
		}
	}
}
