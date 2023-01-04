package com.shimbhu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringSecurityWithJpa1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityWithJpa1Application.class, args);
	}

}
