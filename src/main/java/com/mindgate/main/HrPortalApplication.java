package com.mindgate.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mindgate.main.repository.ProjectRowMapper;

@SpringBootApplication
public class HrPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrPortalApplication.class, args);
		System.out.println("Application Started Successfully...");
	}

}
