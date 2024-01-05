package com.ewangclarks.carbookdriver.domain.service;

import com.ewangclarks.carbookdriver.config.KafkaConfigProperties;
import com.ewangclarks.carbookdriver.service.PublishMessage;
import com.sharedlibrary.sharedkafkadto.dto.CustomMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class PublishMessageImpl implements PublishMessage {

    private final KafkaTemplate<String, CustomMessage> template;
    private final KafkaConfigProperties kafkaConfigProperties;

    @Override
    public void sendMessage(CustomMessage message) {
        message.setMessageId(UUID.randomUUID().toString());
        message.setDate(new Date());
        Message<CustomMessage> msg = MessageBuilder
                .withPayload(message)
                .setHeader(KafkaHeaders.TOPIC,kafkaConfigProperties.getTopicName())
                .build();
        template.send(msg);
    }
}