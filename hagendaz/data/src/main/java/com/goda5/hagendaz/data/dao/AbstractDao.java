package com.goda5.hagendaz.data.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.goda5.hagendaz.common.domain.BaseEntity;

public abstract class AbstractDao <T extends BaseEntity> {
	@PersistenceContext
	protected EntityManager em;
	
	public void save(T object) {
		em.persist(object);
	}
	
	public T find(long id) {
		return em.find(getPersistentClass(), id);
	}
	
	public long count() {
		return em.createQuery("select count(c) from " + getPersistentClass().getName() + " c", Long.class).getSingleResult();
	}
	
	protected abstract Class<T> getPersistentClass();
}
