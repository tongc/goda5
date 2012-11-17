package com.goda5.hagendaz.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskRejectedException;
import org.testng.annotations.Test;

import com.goda5.hagendaz.common.domain.other.TEService;

public class TEITCase extends IntegrationTestBase {
	@Autowired
	private TEService tes;
	
	@Test
	public void test() throws InterruptedException {
		tes.ttt();
		Thread.sleep(1000);
	}
	
	@Test(dependsOnMethods = {"test"}, expectedExceptions={TaskRejectedException.class})
	public void test1() {
		tes.ttt();
	}
}
