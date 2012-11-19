package com.goda5.hagendaz.data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.goda5.hagendaz.common.util.TestConf;

@TestConf
@Configuration
@ComponentScan("com.goda5.hagendaz.data")
public class ConfigurationBean {
	@Bean
	public DataSource dataSource() {
		return Mockito.mock(DataSource.class);
	}
	
	@Bean
	public EntityManagerFactory emf() {
		EntityManagerFactory emf = Mockito.mock(EntityManagerFactory.class);
		Mockito.when(emf.createEntityManager()).thenReturn(em());
		return emf;
	}
	
	@Bean(name = "em")
	public EntityManager em() {
		EntityManager em = Mockito.mock(EntityManager.class);
		return em;
	}
}
