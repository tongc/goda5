package com.goda5.hagendaz.web.controller;

import org.springframework.hateoas.ResourceSupport;

public class Greeting extends ResourceSupport {

	private final String content;

	public Greeting(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}
}
