package com.training.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RealEstateBrokerApplication extends SpringBootServletInitializer {

	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(RealEstateBrokerApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(RealEstateBrokerApplication.class, args);
	}

}
