package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.demo", "com.maneesh.controller", "com.maneesh.service",
		"com.maneesh.errorHandling" })
@EntityScan("com.maneesh.entity")
@EnableJpaRepositories("com.maneesh.repository")
public class DemoApplication {

	@Value("${welcome.message}")
	private String message;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
