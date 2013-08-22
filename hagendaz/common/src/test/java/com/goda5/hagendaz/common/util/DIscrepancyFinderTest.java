package com.goda5.hagendaz.common.util;

import java.util.Arrays;

import org.testng.annotations.Test;

import com.goda5.hagendaz.common.domain.Account;

public class DIscrepancyFinderTest {

	@Test(expectedExceptions = IllegalAccessException.class)
	public void testFind() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Account a1 = new Account();
		a1.setName("ABCD");
		Account a2 = new Account();
		a2.setName("ABC");
		Account a3 = new Account();
		a3.setName("ABC");
		new DiscrepancyFinder().hasDiscrepancy(Account.class, Arrays.asList(new Account[]{a1,a2,a3}), "name");
	}
}
