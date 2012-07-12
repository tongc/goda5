package com.goda5.hagendaz.common.domain;

import javax.persistence.Entity;

@Entity
public class Account extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2210702135891049417L;

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
