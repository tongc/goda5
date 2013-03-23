package com.goda5.hagendaz.common.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "UserStatus")
public class UserStatus {
	private Long userID;

	public Long getUserID() {
		return userID;
	}

	public void setUserID(final Long userID) {
		this.userID = userID;
	}

}
