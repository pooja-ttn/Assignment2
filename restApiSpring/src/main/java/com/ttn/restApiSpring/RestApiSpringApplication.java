package com.ttn.restApiSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableJpaRepositories("com.ttn.restApiSpring.repositories")
@EntityScan("com.ttn.restApiSpring.entities")
public class RestApiSpringApplication {

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(RestApiSpringApplication.class, args);
	}

}
