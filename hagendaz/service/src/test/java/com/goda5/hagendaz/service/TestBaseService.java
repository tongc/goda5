package com.goda5.hagendaz.service;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

@ContextConfiguration(
	    classes = ConfigurationBean.class, loader = AnnotationConfigContextLoader.class )
public class TestBaseService extends AbstractTestNGSpringContextTests {

}
