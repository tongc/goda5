package com.goda5.hagendaz.data.dao;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.goda5.hagendaz.common.domain.BaseEntity;
import com.yammer.metrics.core.Counter;
import com.yammer.metrics.core.MetricsRegistry;

public abstract class AbstractDao <T extends BaseEntity> {
	@Autowired
	private MetricsRegistry metrics;
	
	@PersistenceContext
	protected EntityManager em;
	
	private Counter savedObjects;
	
	@PostConstruct
	public void initCounter() {
		savedObjects = metrics.newCounter(AbstractDao.class, "saved-objects");
	}
	
	public void save(T object) {
		em.persist(object);
		savedObjects.inc();
	}
	
	public T find(long id) {
		return em.find(getPersistentClass(), id);
	}
	
	public long count() {
		return em.createQuery("select count(c) from " + getPersistentClass().getName() + " c", Long.class).getSingleResult();
	}
	
	protected abstract Class<T> getPersistentClass();
}
