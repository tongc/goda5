package com.goda5.hagendaz.common;

import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;

@ActiveProfiles("local")
@ContextConfiguration(locations = { "classpath:common.xml" })
public class IntegrationTestBase extends AbstractTransactionalTestNGSpringContextTests {
	
}
