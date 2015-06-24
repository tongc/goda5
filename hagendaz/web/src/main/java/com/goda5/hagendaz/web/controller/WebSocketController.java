package com.goda5.hagendaz.web.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import java.util.Date;

/**
 * Created by tong on 22/02/2015.
 */
@Controller
public class WebSocketController {
    @MessageMapping("/greeting")
    public String handle(String greeting) {
        return "[" + new Date().getTime() + ": " + greeting;
    }


}
