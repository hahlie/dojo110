package com.demo.dojo110;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Dojo110Application {

	public static void main(String[] args) {
		SpringApplication.run(Dojo110Application.class, args);
	}

	@GetMapping("/info")
	public String info(){
		return "Dojo 1.10 demo project base on spring boot2.01";
	}
}
