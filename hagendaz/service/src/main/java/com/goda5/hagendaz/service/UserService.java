package com.goda5.hagendaz.service;

import javax.inject.Inject;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.goda5.hagendaz.common.domain.User;
import com.goda5.hagendaz.data.dao.UserDao;

@Service
public class UserService {
	@Inject
	private UserDao dao;

	@CacheEvict(value = "UserService", allEntries=true)
	@Transactional
	public void saveUser(final User user) {
		dao.save(user);
	}

	@Cacheable(value = "UserService", key="{#root.methodName}")
	@Transactional(readOnly=true)
	public long getUserCount() {
		return dao.count();
	}

	@Cacheable(value = "UserService", key="{#root.methodName}")
	@Transactional(readOnly=true)
	public User findUser(final Long userId) {
		return dao.find(userId);
	}
}
