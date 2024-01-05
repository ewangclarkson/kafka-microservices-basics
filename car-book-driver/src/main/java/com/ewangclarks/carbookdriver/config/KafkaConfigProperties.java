package com.ewangclarks.carbookdriver.config;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties("apacahekafka.car")
public class KafkaConfigProperties {
    private String topicName;
}
