package com.goda5.hagendaz.common.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.hibernate.annotations.Type;
import org.joda.money.Money;

@Entity
public class Account extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	
	@Column
	@Type(type="org.jadira.usertype.moneyandcurrency.joda.PersistentMoneyAmount", parameters = { @org.hibernate.annotations.Parameter(name="currencyCode", value="USD") })
	private Money balances;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setBalances(Money balances) {
		this.balances = balances;
	}

	public Money getBalances() {
		return balances;
	}
	
	public String toString() {
		return name + balances;
	}
}
