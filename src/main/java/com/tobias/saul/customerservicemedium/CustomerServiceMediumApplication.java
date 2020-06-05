package com.tobias.saul.customerservicemedium;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerServiceMediumApplication implements CommandLineRunner{
	
	@Value("${app.name}")
	private String appName;

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceMediumApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Application name retrieved from Config Server: " + appName);
	}
	
}
