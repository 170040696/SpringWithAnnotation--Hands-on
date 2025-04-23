package com.telusko.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages= "com.telusko")
public class Config {

	public Config() {
		  System.out.println("Config bean created");
	  }
	
	@Bean
	public password createPasswordObj() {
		password pass=new password("Sha algo");
		return pass;
	}
}
