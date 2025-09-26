package com.hongik.springboot_twitter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringbootTwitterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTwitterApplication.class, args);
	}

}
