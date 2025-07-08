package com.javalearning.spring_jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication {
	
	static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@PostConstruct
	public void init()*  {
		logger.info("Application started");
	}

	public static void main(String[] args) {
		logger.info("Application executed");
		logger.info("checking jenkins continous build  ");
		logger.info("checking email notification from jenkins ");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
