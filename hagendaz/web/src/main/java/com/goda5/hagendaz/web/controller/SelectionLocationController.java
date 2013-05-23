package com.goda5.hagendaz.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SelectionLocationController extends BaseController {
    @RequestMapping("/selectLocation")
    public String selectLocation() {
    	return "selectLocation";
    }
}
