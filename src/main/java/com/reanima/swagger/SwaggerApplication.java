package com.reanima.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class SwaggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwaggerApplication.class, args);
	}

}
