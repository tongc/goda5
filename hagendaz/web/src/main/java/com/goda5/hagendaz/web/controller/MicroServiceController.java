package com.goda5.hagendaz.web.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class MicroServiceController {
	private static final String TEMPLATE = "Hello, %s!";
	
	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/greeting")
	@ResponseBody
	public HttpEntity<Greeting> greeting(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {

		Greeting greeting = new Greeting(String.format(TEMPLATE, name));
		greeting.add(linkTo(methodOn(MicroServiceController.class).greeting(name))
				.withSelfRel());

		return new ResponseEntity<Greeting>(greeting, HttpStatus.OK);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MicroServiceController.class, args);
	}
}
