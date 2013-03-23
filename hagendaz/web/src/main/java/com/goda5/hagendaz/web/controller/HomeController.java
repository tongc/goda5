package com.goda5.hagendaz.web.controller;

import javax.inject.Inject;

import org.joda.time.LocalDateTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.goda5.hagendaz.common.domain.Account;
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
	
	@ModelAttribute("account")
	public Account getAccount() {
		System.out.println("=======called=======" + Thread.currentThread().getName());
		Account a = new Account();
		a.setName("Init");
		a.setId(12345L);
		System.out.println("MEMORY ADD: " + System.identityHashCode(a));
		return a;
	}
	
	@RequestMapping(value = "/setupAccount", method = RequestMethod.GET)
	public ModelAndView account(@ModelAttribute("account") Account account) {
		System.out.println("GET MEMORY ADD: " + System.identityHashCode(account));
		ModelAndView mv = new ModelAndView("account");
		mv.addObject("name", account.getName());
		System.out.println("Account name: " + account.getName() + " balance: " + account.getId());
		return mv;
	}
	
	@RequestMapping(value = "/setupAccount", method = RequestMethod.POST)
	public void submitAccount(@ModelAttribute("account") Account account) {
		System.out.println("POST MEMORY ADD: " + System.identityHashCode(account));
		System.out.println("POSTED data: " + account.getName() + " balance: " + account.getId());
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
