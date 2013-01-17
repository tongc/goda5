package com.goda5.hagendaz.common.util;

import org.springframework.web.servlet.ModelAndView;

public class PmdTest {
	public ModelAndView testMethod(ModelAndView mv1) {
		System.out.println("PMD Test Method");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("dfsdfsdfs");
		mv.addObject("aaaa", "abbb");
		
		return new ModelAndView();
	}
	
	public int testMethod2() {
		System.out.println("PMD Test Method");
		return 10;
	}
}
