package com.main.healthCare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan("com.main.healthCare,"
+"com.healthCare.Controller")
@SpringBootApplication
public class HealthCareApplication {

	public static void main(String[] args) {
		System.out.println("Start Application..............");
		SpringApplication.run(HealthCareApplication.class, args);
		System.out.println("End Application..................");
	}
}
