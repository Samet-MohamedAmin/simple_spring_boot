package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.apache.log4j.Logger;


@SpringBootApplication
public class DemoApplication {

	final static Logger logger = Logger.getLogger(DemoApplication.class);

	public static void main(String[] args) {

		logger.info("It's working !..");
		SpringApplication.run(DemoApplication.class, args);
	}
}
