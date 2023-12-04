package com.springcore.constructorArg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constructorArg/constructorconfig.xml");
		Person person=(Person)context.getBean("conArg");
		System.out.println(person);
		
		Addition addition=(Addition)context.getBean("add");
		addition.doSum();
		
	}

}
