package com.ewangclarks.carbookdriver.config;

import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
@RequiredArgsConstructor
public class KafkaTopicConfiguration {

    private final KafkaConfigProperties kafkaConfigProperties;


    @Bean
    NewTopic topic() {
        return TopicBuilder
                .name(kafkaConfigProperties.getTopicName())
                .partitions(10)
                .replicas(1)
                .build();
    }
}
