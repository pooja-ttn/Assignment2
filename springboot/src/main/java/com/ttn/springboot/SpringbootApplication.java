package com.ttn.springboot;

import com.ttn.springboot.question3.User;
import com.ttn.springboot.question4_5_6.Database;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages={"com.ttn.springboot.question_7.entity"})
@EnableJpaRepositories(basePackages={"com.ttn.springboot.question_7.repository"})
public class SpringbootApplication {
	//Question 3
   @Bean
   User user(){
   	return new User("Pooja","ttn");
   }


//   Question 4-
	@Bean
	Database database(){
   	Database database=new Database();
   	return database;
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
