package com.toni.peeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class PeeperApplication {
	
	public static void main(String[] args) {
		// Launch the application
		SpringApplication.run(PeeperApplication.class, args);

	}

}
