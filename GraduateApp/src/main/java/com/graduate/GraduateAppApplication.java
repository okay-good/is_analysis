package com.graduate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraduateAppApplication {
	private static Logger logger=LoggerFactory.getLogger(GraduateAppApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(GraduateAppApplication.class, args);
		logger.info("Application Start Is Successful...");
	}

}

