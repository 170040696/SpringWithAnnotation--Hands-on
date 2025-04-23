package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.config.password;

public class LaunchApp1 {

	public static void main(String[] args) {
		
		ApplicationContext container= new ClassPathXmlApplicationContext("applicationConfig.xml");
		password pass= container.getBean(password.class);
		pass.algoInfo();
	}
}
