package com.goda5.hagendaz.data.dao;

import org.springframework.stereotype.Repository;

import com.goda5.hagendaz.common.domain.UserGroup;

@Repository
public class UserGroupDao extends AbstractDao<UserGroup> {
	@Override
	protected Class<UserGroup> getPersistentClass() {
		return UserGroup.class;
	}
}
