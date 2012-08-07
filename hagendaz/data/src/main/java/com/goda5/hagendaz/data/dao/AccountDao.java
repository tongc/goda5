package com.goda5.hagendaz.data.dao;

import org.joda.money.Money;
import org.springframework.stereotype.Repository;

import com.goda5.hagendaz.common.domain.Account;

@Repository
public class AccountDao extends AbstractDao<Account> {
	public void deduct(Account account, Money amount) {
		
	}
	
	public void add(Account account, Money amount) {
		
	}

	@Override
	protected Class<Account> getPersistentClass() {
		return Account.class;
	}
}
