package com.goda5.hagendaz.common;

import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@ActiveProfiles("local")
@ContextConfiguration(locations = { "classpath:common.xml" })
public class IntegrationTestBase extends AbstractTestNGSpringContextTests {

}
