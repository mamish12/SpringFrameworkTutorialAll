package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student student = applicationContext.getBean("getStudent", Student.class);
		System.out.println(student);
		System.out.println("======================");
		student.study();
	}

}
