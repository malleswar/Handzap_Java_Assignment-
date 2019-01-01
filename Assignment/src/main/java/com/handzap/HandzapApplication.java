package com.handzap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = { "com.handzap" })
public class HandzapApplication extends SpringBootServletInitializer {

	private static final Class<HandzapApplication> APPLICATION_NAME = HandzapApplication.class;
	private final Logger logger = LoggerFactory.getLogger(APPLICATION_NAME);

	public static void main(String[] args) {
		SpringApplication.run(APPLICATION_NAME, args);
	}

	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder application) {
		return application.sources(APPLICATION_NAME);
	}

}
