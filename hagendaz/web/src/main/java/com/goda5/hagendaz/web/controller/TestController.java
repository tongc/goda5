package com.goda5.hagendaz.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tong on 24/10/2015.
 */

@RestController
public class TestController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
