package com.goda5.hagendaz.common.domain.twopc;

public class Transaction implements Comparable<Transaction> {
	private Integer transactionId;
	
	public Transaction(Integer transactionId) {
		this.transactionId = transactionId;
	}

	@Override
	public int compareTo(Transaction t) {
		return t.getTransactionId().compareTo(this.getTransactionId());
	}
	
	@Override
	public boolean equals(Object t) {
		if(!t.getClass().equals(this.getClass())) {return false;}
		return ((Transaction)t).getTransactionId().equals(this.getTransactionId());
	}

	@Override
	public int hashCode() {
		return transactionId * 7;
	}
	
	public Integer getTransactionId() {
		return transactionId;
	}
}
