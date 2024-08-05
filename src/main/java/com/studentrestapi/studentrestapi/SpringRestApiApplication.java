package com.studentrestapi.studentrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringRestApiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiApplication.class, args);
		/*
		 * System.out.println("Added comments to test jenkins");
		 * System.out.println("Added 2ndcomments to test jenkins");
		 */
	}

}
