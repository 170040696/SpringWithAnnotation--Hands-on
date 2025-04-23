package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.config.Config;
import com.telusko.config.password;

public class LaunchApp1 {

	public static void main(String[] args) {
		
		ApplicationContext container= new AnnotationConfigApplicationContext(Config.class);
		password pass= container.getBean(password.class);
		pass.algoInfo();
	}
}
