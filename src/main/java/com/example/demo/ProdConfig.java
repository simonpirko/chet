package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.HandlerInterceptor;

@Configuration
@Profile("prod")
public class ProdConfig implements HandlerInterceptor {
	@Bean
	public String name() {
		return "Andrew";
	}
}
