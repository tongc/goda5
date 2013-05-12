package com.goda5.hagendaz.data.dao;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.goda5.hagendaz.common.domain.BaseEntity;
import com.yammer.metrics.core.Counter;
import com.yammer.metrics.core.MetricsRegistry;

public abstract class AbstractDao <T extends BaseEntity> {
	private static Logger LOGGER = LoggerFactory.getLogger(AbstractDao.class);
	
	@Autowired
	private MetricsRegistry metricsRegistry;
	
	@PersistenceContext
	protected EntityManager em;
	
	private Counter savedObjects;
	
	@PostConstruct
	public void initCounter() {
		savedObjects = metricsRegistry.newCounter(AbstractDao.class, "saved-objects");
		LOGGER.trace("Yammer metrics counter inited");
	}
	
	public void save(T object) {
		em.persist(object);
		savedObjects.inc();
		LOGGER.debug("Object saved " + object);
	}
	
	public T find(long id) {
		return em.find(getPersistentClass(), id);
	}
	
	public long count() {
		return em.createQuery("select count(c) from " + getPersistentClass().getName() + " c", Long.class).getSingleResult();
	}
	
	protected abstract Class<T> getPersistentClass();
}
