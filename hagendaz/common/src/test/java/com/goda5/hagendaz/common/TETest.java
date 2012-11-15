package com.goda5.hagendaz.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import com.goda5.hagendaz.common.domain.other.TEService;

public class TETest extends IntegrationTestBase {
	@Autowired
	private TEService tes;
	
	@Test
	public void test() throws InterruptedException {
		tes.ttt();
		Thread.sleep(10000);
	}
	
	@Test
	public void test1() {
		tes.ttt();
	}
}
