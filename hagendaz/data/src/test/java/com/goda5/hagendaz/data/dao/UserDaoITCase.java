package com.goda5.hagendaz.data.dao;

import javax.inject.Inject;

import org.testng.annotations.Test;

import com.goda5.hagendaz.common.domain.User;
import com.goda5.hagendaz.data.IntegrationTestBaseDao;

public class UserDaoITCase extends IntegrationTestBaseDao {
	@Inject
	private UserDao userDao;
	
	@Test
	public void testSaveUser() {
		User user = new User();
		userDao.save(user);
	}
}
