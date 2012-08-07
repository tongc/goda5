package com.goda5.hagendaz.service;

import java.io.IOException;

import javassist.NotFoundException;

import javax.inject.Inject;

import org.objectweb.asm.ClassReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.ClassEditor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.goda5.hagendaz.common.domain.User;

public class UserServiceITCase extends IntegrationTestBaseService {
	@Inject
	private UserService service;
	
	private Logger logger = LoggerFactory.getLogger(UserServiceITCase.class);
	
	private static final String USER_NAME = "test";
	
	@Test
	public void testGetUserCount() {
		logger.info("--------------------DB operation to get user count:----------------------");
		Assert.assertEquals(service.getUserCount(), 0);
		
		User user = new User();
		user.setUsername(USER_NAME);
		service.saveUser(user);
		
		logger.info("--------------------DB operation to get user count:----------------------");
		Assert.assertEquals(service.getUserCount(), 1);
		
		logger.info("--------------------Cache operation to get user count:--------------------");
		Assert.assertEquals(service.getUserCount(), 1);
		
		logger.info("--------------------Cache operation to get user count:--------------------");
		Assert.assertEquals(service.getUserCount(), 1);
	}
	
	@Test
	public void testGetUserCountWithoutEvict() throws IOException {
		//org.objectweb.asm.AnnotationVisitor  av = new org.objectweb.asm.AnnotationVisitor();
	}
	
}