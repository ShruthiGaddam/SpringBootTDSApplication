package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.tds.Controller")
@ComponentScan("com.tds.Dao")
@ComponentScan("com.tds.Service")
@ComponentScan("com.tds.Model")
@EntityScan(basePackages = {"com.tds.Model"})
@SpringBootApplication
public class SpringBootTDSApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTDSApplication.class, args);
	}
}
