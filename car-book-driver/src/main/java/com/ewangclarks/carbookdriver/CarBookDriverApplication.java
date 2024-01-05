package com.ewangclarks.carbookdriver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ConfigurationPropertiesScan(basePackages = "com.ewangclarks.carbookdriver.*")
@EntityScan({"com.sharedlibrary.*"})
public class CarBookDriverApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarBookDriverApplication.class, args);
	}

}