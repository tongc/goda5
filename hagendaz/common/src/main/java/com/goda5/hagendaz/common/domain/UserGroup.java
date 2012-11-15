package com.goda5.hagendaz.common.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage=CacheConcurrencyStrategy.TRANSACTIONAL)
public class UserGroup extends BaseEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@OneToMany
	@Cache(usage=CacheConcurrencyStrategy.TRANSACTIONAL)
	private List<User> users;

	public List<User> getUsers() {
		return users;
	}
}
