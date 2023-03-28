package com.gcu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ComponentScan({"com.gcu"})
@SpringBootApplication
public class CST323SpringV2 {

	public static void main(String[] args) {
		SpringApplication.run(CST323SpringV2.class, args);
		log.info("Springboot and lombok application started successfully.");
	}

}
