package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springcore.lifecycle.Samosa;

@Configuration
public class JavaConfig {
	


	@Bean
	public Student getStudent() {
		// creating a new object
		Student student = new Student();
		return student;
	}

}
