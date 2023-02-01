package com.deloitte.myproject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class MyprojectApplication {


	public static void main(String[] args) {

		log.info("Application Starting...");
		SpringApplication.run(MyprojectApplication.class, args);
		log.info("Application Started");

	}

}