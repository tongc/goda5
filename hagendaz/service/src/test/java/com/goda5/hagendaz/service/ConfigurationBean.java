package com.goda5.hagendaz.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.goda5.hagendaz.common.util.TestConf;
import com.goda5.hagendaz.data.dao.AccountDao;
import com.goda5.hagendaz.data.dao.UserDao;

@TestConf
@Configuration
@ComponentScan("com.goda5.hagendaz.service")
@ImportResource("/service.xml")
public class ConfigurationBean {
	@Bean
	public AccountDao accountDao() {
		return Mockito.mock(AccountDao.class);
	}
	
	@Bean
	public UserDao userDao() {
		return Mockito.mock(UserDao.class);
	}
	
	@Bean
	public EntityManagerFactory emf() {
		return Mockito.mock(EntityManagerFactory.class);
	}
	
	@Bean(name = "em")
	public EntityManager em() {
		return Mockito.mock(EntityManager.class);
	}
}
