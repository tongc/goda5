package com.goda5.hagendaz.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class PostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object obj, String beanName)
			throws BeansException {
		System.out.println("AFTER======================" + obj + " " + beanName);
		return obj;
	}

	@Override
	public Object postProcessBeforeInitialization(Object obj, String beanName)
			throws BeansException {
		System.out.println("BEFORE======================" + obj + " " + beanName);
		if(PostProcessorAware.class.isAssignableFrom(obj.getClass())) {
			((PostProcessorAware)obj).setValue("the value for " + beanName);
		}
		return obj;
	}
	
}
