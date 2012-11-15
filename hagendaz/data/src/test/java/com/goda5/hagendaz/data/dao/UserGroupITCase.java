package com.goda5.hagendaz.data.dao;

import javax.annotation.Resource;

import org.testng.annotations.Test;

import com.goda5.hagendaz.common.domain.UserGroup;
import com.goda5.hagendaz.data.IntegrationTestBaseDao;

public class UserGroupITCase extends IntegrationTestBaseDao {
	@Resource
	private UserGroupDao userGroupDao;
	
	@Test
	public void save() {
		UserGroup userGroup = new UserGroup();
		userGroupDao.save(userGroup);
	}
}
