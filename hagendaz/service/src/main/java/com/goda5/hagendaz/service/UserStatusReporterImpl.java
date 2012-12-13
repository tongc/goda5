package com.goda5.hagendaz.service;

import javax.inject.Inject;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.goda5.hagendaz.common.domain.User;
import com.goda5.hagendaz.common.domain.UserStatus;

@Service("userStatusReporterImpl")
@WebService(endpointInterface = "com.goda5.hagendaz.service.ws.UserStatusReporter")
public class UserStatusReporterImpl implements com.goda5.hagendaz.service.rs.UserStatusReporter, com.goda5.hagendaz.service.ws.UserStatusReporter {

	@Inject
	private UserService userService;

	@Override
	public UserStatus getUserStatus(final Long userId) {
		final UserStatus us = new UserStatus();
		final User user = userService.findUser(userId);
		us.setUserID(user.getId());
		System.out.println(user.getId() + ":" + userId);
		return us;
	}
}
