package com.image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class ImageDataBase1Application {

	public static void main(String[] args) {
		SpringApplication.run(ImageDataBase1Application.class, args);
	}

}
