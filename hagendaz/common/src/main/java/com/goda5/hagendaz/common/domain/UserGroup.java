package com.goda5.hagendaz.common.domain;

import java.util.List;

import javax.persistence.OneToMany;

public class UserGroup {
	@OneToMany
	private List<User> users;

	public List<User> getUsers() {
		return users;
	}
}
