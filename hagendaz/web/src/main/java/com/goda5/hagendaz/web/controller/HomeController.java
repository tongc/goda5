package com.goda5.hagendaz.web.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.goda5.hagendaz.service.UserService;

@Controller
public class HomeController extends BaseController {

	@Inject
	private UserService userService;

	@RequestMapping("/home")
	public ModelAndView home() {
		final ModelAndView mv = new ModelAndView("home");
		mv.addObject("userCount", userService.getUserCount());
		return mv;
	}
}
