package com.goda5.hagendaz.service.ws;

import javax.inject.Inject;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.goda5.hagendaz.common.domain.User;
import com.goda5.hagendaz.common.domain.UserStatus;
import com.goda5.hagendaz.service.UserService;

@Service
@WebService(endpointInterface = "com.goda5.hagendaz.service.ws.UserStatusReporter")
public class UserStatusReporterImpl implements UserStatusReporter {

	@Inject
	private UserService userService;

	@Override
	public UserStatus getUserStatus(final Long userId) {
		final UserStatus us = new UserStatus();
		final User user = userService.findUser(userId);
		us.setUserID(user.getId());
		return us;
	}
}