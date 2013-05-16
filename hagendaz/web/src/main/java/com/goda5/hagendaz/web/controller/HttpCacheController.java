package com.goda5.hagendaz.web.controller;

import javax.servlet.http.HttpServletResponse;

import org.joda.time.DateTime;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HttpCacheController extends BaseController {
    @InitBinder
    public void setHeaders(HttpServletResponse response) {
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache, no-store, max-age=0, must-revalidate");
        response.setDateHeader("Expires", 0);
    }
    
    @RequestMapping("/cacheGet")
    public @ResponseBody String showContent() {
    	return new DateTime().toString();
    }
}
