package com.goda5.hagendaz.data.dao;

import org.springframework.stereotype.Repository;

import com.goda5.hagendaz.common.domain.QUser;
import com.goda5.hagendaz.common.domain.User;

@Repository
public class UserDao extends AbstractDao<User> {
	private final QUser qUser = QUser.user;

	@Override
	protected Class<User> getPersistentClass() {
		return User.class;
	}
	
}
