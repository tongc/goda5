package com.goda5.hagendaz.service.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.goda5.hagendaz.common.domain.UserStatus;

@Path("/userStatus")
public interface UserStatusReporter {
	@GET
	@Path("{userId}")
	@Produces("application/xml")
	public UserStatus getUserStatus(@PathParam ("userId") Long userId);
}
