package com.goda5.hagendaz.data.dao;

import javax.inject.Inject;

import org.testng.annotations.Test;

import com.goda5.hagendaz.common.domain.Account;
import com.goda5.hagendaz.data.IntegrationTestBaseDao;

public class AccountDaoITCase extends IntegrationTestBaseDao {
	@Inject
	private AccountDao dao;

	@Test
	public void testSaveUser() throws InterruptedException {
		Thread.sleep(1000);
		final Account account = new Account();
		account.setBalances("10.00");
		dao.save(account);

		System.out.println(dao.find(account.getId()));

		Thread.sleep(1000);
	}
}
