package com.goda5.hagendaz.common.domain;

import java.math.BigDecimal;

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
	@Type(type="org.jadira.usertype.moneyandcurrency.joda.PersistentMoneyAmount", parameters = { @org.hibernate.annotations.Parameter(name="currencyCode", value="GBP") })
	private Money balances;

	public void setName(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setBalances(final String amount) {
		this.balances = Money.of(org.joda.money.CurrencyUnit.GBP, new BigDecimal(amount));
	}

	public void setBalances(final BigDecimal amount) {
		this.balances = Money.of(org.joda.money.CurrencyUnit.GBP, amount);
	}

	public BigDecimal getBalances() {
		return balances.getAmount();
	}

	@Override
	public String toString() {
		return name + balances;
	}
}
