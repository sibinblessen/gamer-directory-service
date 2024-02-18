package com.backend.gamerdirectoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.backend.gamerdirectoryservice.*")
public class GamerDirectoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamerDirectoryServiceApplication.class, args);
	}

}
