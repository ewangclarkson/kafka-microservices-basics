package com.ewangclarks.carbookuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;


@SpringBootApplication
@ConfigurationPropertiesScan(basePackages = "com.ewangclarks.carbookuser.*")
@EntityScan({"com.sharedlibrary.*"})
public class CarBookUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarBookUserApplication.class, args);
	}

}
