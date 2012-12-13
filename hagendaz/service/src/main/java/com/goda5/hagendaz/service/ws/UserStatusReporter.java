package com.goda5.hagendaz.service.ws;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.goda5.hagendaz.common.domain.UserStatus;

@WebService
@Path("/userStatus")
public interface UserStatusReporter {
	@GET
	@Path("{userId}")
	@Produces("application/xml")
	public UserStatus getUserStatus(@PathParam ("userId") @WebParam(name = "userId") Long userId);
}
