package com.telusko.config;

public class password {

	private String algo;
	
	public password(String algo) {
		this.algo=algo;
		System.out.println("Password bean created");
	}
	
	public void algoInfo()
	{
		System.out.println("password algo used here is  " +algo);
	}	
	
}
