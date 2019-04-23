package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoConsoleApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoConsoleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello from console");
		for(String arg:args) {
			System.out.println("arg is "+arg);
		}
		
	}

}
