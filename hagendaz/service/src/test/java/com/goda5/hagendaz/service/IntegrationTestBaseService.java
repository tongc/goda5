package com.goda5.hagendaz.service;

import org.springframework.test.context.ContextConfiguration;

import com.goda5.hagendaz.data.IntegrationTestBaseDao;

@ContextConfiguration(locations = { "classpath:service.xml" })
public class IntegrationTestBaseService extends IntegrationTestBaseDao {
	
}
