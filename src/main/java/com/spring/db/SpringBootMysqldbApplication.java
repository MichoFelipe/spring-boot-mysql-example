package com.spring.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.spring.db.repository")
@SpringBootApplication
public class SpringBootMysqldbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMysqldbApplication.class, args);
	}
}
