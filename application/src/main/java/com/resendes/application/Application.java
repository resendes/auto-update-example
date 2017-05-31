package com.resendes.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run( Application.class, args );
	}

	@RestController
	static class HomeController {

		@RequestMapping("/")
		public String home() {
			return "Hello World";
		}
	}
}
