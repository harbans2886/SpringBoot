package com.mandy.springboot.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.mandy.rest"})
public class MainClassExample {

	public static void main(String[] args) {
		SpringApplication.run(MainClassExample.class, args);
	}
}
