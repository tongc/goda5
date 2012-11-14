package com.goda5.hagendaz.data.dao;

import javax.annotation.Resource;
import javax.persistence.EntityManager;

import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.goda5.hagendaz.common.domain.Account;
import com.goda5.hagendaz.data.TestBaseDao;

public class AccountDaoTest extends TestBaseDao {
	private static final String TEST_ACCOUNT_NAME = "TEST";
	@Resource(name = "accountDao")
	private AccountDao accountDao;
	@Resource(name = "em")
	private EntityManager em;
	
	@Test
	public void find() {
		Account account = new Account();
		account.setName(TEST_ACCOUNT_NAME);
		Mockito.when(em.find(Account.class, 1l)).thenReturn(account);
		Assert.assertEquals(accountDao.find(1l).getName(), TEST_ACCOUNT_NAME);
	}
	
	@Test
	public void save() {
		Account account = new Account();
		account.setName(TEST_ACCOUNT_NAME);
		accountDao.save(account);
		Mockito.verify(em).persist(account);
	}
}
