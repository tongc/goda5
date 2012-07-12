package com.goda5.hagendaz.data.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.goda5.hagendaz.common.domain.BaseEntity;

public class AbstractDao <T extends BaseEntity> {
	@PersistenceContext
	private EntityManager em;
	
	protected void save(T object) {
		em.persist(object);
	}
}
