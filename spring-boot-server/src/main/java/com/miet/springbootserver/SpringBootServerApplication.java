package com.miet.springbootserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServerApplication.class, args);
		System.out.println("Hello !");
	}

}
