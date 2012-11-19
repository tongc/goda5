package com.goda5.hagendaz.web;

import org.springframework.test.context.ContextConfiguration;

import com.goda5.hagendaz.service.IntegrationTestBaseService;

@ContextConfiguration(locations = { "classpath:/META-INF/spring/web.xml" })
public class IntegrationTestBaseWeb extends IntegrationTestBaseService {

}
