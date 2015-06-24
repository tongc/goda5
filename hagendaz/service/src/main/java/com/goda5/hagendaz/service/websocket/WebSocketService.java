package com.goda5.hagendaz.service.websocket;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.messaging.core.MessageSendingOperations;
import org.springframework.messaging.simp.broker.BrokerAvailabilityEvent;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by tong on 22/02/2015.
 */
@Service
public class WebSocketService implements ApplicationListener<BrokerAvailabilityEvent> {
    private final MessageSendingOperations<String> messagingTemplate;
    private AtomicBoolean brokerAvailable = new AtomicBoolean();

    @Autowired
    public WebSocketService(MessageSendingOperations<String> messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @Scheduled(fixedDelay=500)
    public void sendQuotes() {
        if (this.brokerAvailable.get()) {
            this.messagingTemplate.convertAndSend("/topic/price.stock." + new Date().getTime(), RandomStringUtils.random(10));
        }
    }

    @Override
    public void onApplicationEvent(BrokerAvailabilityEvent brokerAvailabilityEvent) {
        this.brokerAvailable.set(brokerAvailabilityEvent.isBrokerAvailable());
    }
}
