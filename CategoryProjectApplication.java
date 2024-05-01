package com.categorycrud.Category.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@SpringBootApplication

public class CategoryProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CategoryProjectApplication.class, args);
		System.out.println("my spring boot is started");
	}

}
