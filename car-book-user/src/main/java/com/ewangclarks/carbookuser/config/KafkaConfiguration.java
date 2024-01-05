package com.ewangclarks.carbookuser.config;

import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
@RequiredArgsConstructor
public class KafkaConfiguration {

    private final KafkaConfigurationProperties kafkaConfigurationProperties;

    @Bean
    public NewTopic topic() {
        return TopicBuilder.name(kafkaConfigurationProperties.getTopicName())
                .partitions(10)
                .replicas(1)
                .build();
    }

}
