package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.Arrays;

@Configuration
@PropertySource("classpath:application-dev.properties")
@ConfigurationProperties(prefix = "data")
@Profile("dev")
public class DevConfig implements EnvironmentAware {

	private String name;
	private String lname;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public void setEnvironment(Environment environment) {
		System.out.println(Arrays.toString(environment.getActiveProfiles()));
	}
}



