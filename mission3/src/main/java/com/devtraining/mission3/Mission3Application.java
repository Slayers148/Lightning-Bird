package com.devtraining.mission3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.devtraining.mission2.GameRepository")

@SpringBootApplication
public class Mission3Application {

	public static void main(String[] args) {
		SpringApplication.run(Mission3Application.class, args);
	}
}
