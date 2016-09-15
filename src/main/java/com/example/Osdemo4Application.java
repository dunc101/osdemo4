package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Osdemo4Application {

	public static void main(String[] args) {
		SpringApplication.run(Osdemo4Application.class, args);
	}
	
	@RequestMapping("/ping")
	public String ping() {
		return "pong";
	}
}
