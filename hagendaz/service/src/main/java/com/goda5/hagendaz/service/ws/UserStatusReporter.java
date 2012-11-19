package com.goda5.hagendaz.service.ws;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.goda5.hagendaz.common.domain.UserStatus;

@WebService
public interface UserStatusReporter {
	public UserStatus getUserStatus(@WebParam(name="userId") Long userId);
}
