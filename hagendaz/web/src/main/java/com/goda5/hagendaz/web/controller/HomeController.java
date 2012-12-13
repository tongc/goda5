package com.goda5.hagendaz.web.controller;

import javax.inject.Inject;

import org.joda.time.LocalDateTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.goda5.hagendaz.common.domain.User;
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

	@RequestMapping("/addUser/{username}")
	public ModelAndView addUser(@PathVariable final String username) {
		final User user = new User();
		user.setUsername(username);
		user.setRegDate(new LocalDateTime());
		userService.saveUser(user);
		final ModelAndView mv = new ModelAndView("home");
		mv.addObject("userCount", userService.getUserCount());
		return mv;
	}

	@RequestMapping("/addUserCached/{username}")
	public ModelAndView addUserCached(@PathVariable final String username) {
		return addUser(username);
	}

	@RequestMapping("/findUser/{userid}")
	public ModelAndView findUser(@PathVariable final Long userid) {
		final ModelAndView mv = new ModelAndView("userStatus");
		mv.addObject("userId", userService.findUser(userid).getId());
		return mv;
	}
}
