package com.goda5.hagendaz.service;

import javax.annotation.Resource;

import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.goda5.hagendaz.data.dao.UserDao;

public class UserServiceTest extends TestBaseService {
	@Resource
	private UserService userService;
	@Resource
	private UserDao dao;
	
	@Test
	public void getUserCount() {
		Mockito.when(dao.count()).thenReturn(100l);
		Assert.assertEquals(userService.getUserCount(), 100l);
		Mockito.when(dao.count()).thenReturn(200l);
		logger.info("-----------cache NOT invalidated------------");
		Assert.assertEquals(userService.getUserCount(), 100l);
		Assert.assertEquals(userService.getUserCount(), 100l);
	}
	
	@Test
	public void getUserCountAndSave() {
		Mockito.when(dao.count()).thenReturn(100l);
		Assert.assertEquals(userService.getUserCount(), 100l);
		Mockito.when(dao.count()).thenReturn(200l);
		userService.saveUser(null);
		logger.info("-----------cache invalidated------------");
		Assert.assertEquals(userService.getUserCount(), 200l);
	}
}
