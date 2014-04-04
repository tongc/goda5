package com.goda5.hagendaz.web.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.joda.time.LocalDateTime;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.http.HttpStatus;

import com.goda5.hagendaz.common.domain.Account;
import com.goda5.hagendaz.common.domain.User;
import com.goda5.hagendaz.common.domain.other.TestObject;
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
	
	@RequestMapping(value = "/test", method = RequestMethod.GET, produces=MediaType.TEXT_HTML_VALUE)
	@ResponseBody
	public String test() {
		return "test";
	}
	
	//302 spring redirect
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public String test2() {
		return "redirect:google.com";
	}
	
	@RequestMapping(value = "/test3", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String test3() {
		return "test3";
	}
	
	@RequestMapping(value = "/test4", method = RequestMethod.GET)
	@ResponseBody
	public String test4() {
		throw new RuntimeException("test4");
	}

	@RequestMapping(value = "/test5", method = RequestMethod.GET)
	@ResponseBody
	public TestObject test5() {
		return new TestObject("test");
	}
	
	@ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public com.goda5.hagendaz.common.domain.other.Error handleException(HttpServletRequest req, Exception ex) {
	    return new com.goda5.hagendaz.common.domain.other.Error(ex.getMessage());
	}
}
