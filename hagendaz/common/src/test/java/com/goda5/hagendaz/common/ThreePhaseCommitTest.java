package com.goda5.hagendaz.common;

import java.util.concurrent.ExecutionException;

import org.testng.annotations.Test;

import com.goda5.hagendaz.common.domain.threepc.TransactionDirector;

public class ThreePhaseCommitTest {
	@Test
	public void test() throws InterruptedException, ExecutionException {
		TransactionDirector dir = new TransactionDirector(10);
		dir.vote();
		dir.tryCommit();
	}
}
