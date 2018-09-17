package com.hhg.jerry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SpringbootApplication {
	private static Logger logger = LoggerFactory.getLogger(SpringbootApplication.class.getName());
	public static void main(String[] args) {
		logger.info("Before start application : {}" , SpringbootApplication.class.getName());
		SpringApplication.run(SpringbootApplication.class, args);
		logger.info("Service started ... Service name : {} " + SpringbootApplication.class.getName());
	}
}
