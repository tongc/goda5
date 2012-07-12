package com.goda5.hagendaz.common.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class User extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2210702135891049417L;
	@Column
	private String username;

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}
}