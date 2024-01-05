package com.ewangclarks.carbookuser.config;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("apachekafka.car")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KafkaConfigurationProperties {
    private String topicName;
}
