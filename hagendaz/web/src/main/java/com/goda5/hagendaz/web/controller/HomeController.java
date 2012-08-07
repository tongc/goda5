package com.goda5.hagendaz.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController {
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("Home");
		return mv;
	}
}
