package com.desafiojava.desafiojava.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.desafiojava.desafiojava.repository")
@ComponentScan(basePackages = { "com.desafiojava.desafiojava.model" })
@EntityScan("com.desafiojava.desafiojava.model")
@SpringBootApplication
public class DesafioJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioJavaApplication.class, args);
	}

}
