package com.ewangclarks.carbookuser.domain.service;

import com.sharedlibrary.sharedkafkadto.dto.CustomMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MessageSubscription {

    @KafkaListener(topics = "${apachekafka.car.topic-name}",groupId = "user-group")
    public void listen(CustomMessage message) {
        log.info(String.format("Object listened from topic car-location: %s",message));
    }
}
