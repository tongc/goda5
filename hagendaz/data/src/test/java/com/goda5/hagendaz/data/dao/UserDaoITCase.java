package com.goda5.hagendaz.data.dao;

import javax.inject.Inject;

import org.joda.time.LocalDateTime;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.goda5.hagendaz.common.domain.User;
import com.goda5.hagendaz.data.IntegrationTestBaseDao;

public class UserDaoITCase extends IntegrationTestBaseDao {
	@Inject
	private UserDao dao;
	
	private static final LocalDateTime DATETIME = new LocalDateTime();
	private static final String USER_NAME = "TEST";
	
	@BeforeClass
	public void ini() {
		logger.debug(DATETIME.toString());
	}
	
	@BeforeMethod
	public void init() {
		
	}
	
	@Test
	public void testSaveUser() {
		User user = new User();
		user.setUsername(USER_NAME);
		user.setRegDate(DATETIME);
		dao.save(user);
	}
}
