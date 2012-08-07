package com.goda5.hagendaz.service;

import javax.inject.Inject;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.goda5.hagendaz.common.domain.User;
import com.goda5.hagendaz.data.dao.UserDao;

@Service
public class UserService {
	@Inject
	private UserDao dao;
	
	@CacheEvict(value = "UserService", allEntries=true)
	public void saveUser(User user) {
		dao.save(user);
	}
	
	@Cacheable(value = "UserService", key="{#root.methodName}")
	public long getUserCount() {
		return dao.count();
	}
}
