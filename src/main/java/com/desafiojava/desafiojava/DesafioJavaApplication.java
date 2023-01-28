package com.desafiojava.desafiojava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
@ComponentScan
@EntityScan("com.desafiojava.desafiojava.Endereco")
public class DesafioJavaApplication {
	public static void main(String[] args) {
		SpringApplication.run(DesafioJavaApplication.class, args);
	}
}
