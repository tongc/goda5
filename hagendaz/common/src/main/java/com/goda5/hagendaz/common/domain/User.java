package com.goda5.hagendaz.common.domain;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;

@Entity
@Cacheable
public class User extends BaseEntity {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Column(unique=true)
	private String username;

	@Column
	@Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDateTime")
	private LocalDateTime regDate;

	public void setUsername(final String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setRegDate(final LocalDateTime regDate) {
		this.regDate = regDate;
	}

	public LocalDateTime getRegDate() {
		return regDate;
	}
}