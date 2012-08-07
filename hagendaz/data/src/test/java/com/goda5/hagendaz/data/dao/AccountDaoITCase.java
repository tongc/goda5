package com.goda5.hagendaz.data.dao;

import java.math.BigDecimal;

import javax.inject.Inject;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.testng.annotations.Test;

import com.goda5.hagendaz.common.domain.Account;
import com.goda5.hagendaz.data.IntegrationTestBaseDao;

public class AccountDaoITCase extends IntegrationTestBaseDao {
	@Inject
	private AccountDao dao;
	
	@Test
	public void testSaveUser() {
		Account account = new Account();
		Money money = Money.of(CurrencyUnit.USD, new BigDecimal(10.00));
		account.setBalances(money);
		dao.save(account);
		
		System.out.println(dao.find(account.getId()));
	}
}
