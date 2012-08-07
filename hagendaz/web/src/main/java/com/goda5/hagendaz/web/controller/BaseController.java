package com.goda5.hagendaz.web.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

public class BaseController {
	@ExceptionHandler(NullPointerException.class)
	public ModelAndView handleNPE() {
		ModelAndView mv = new ModelAndView("NPE");
		return mv;
	}
}
