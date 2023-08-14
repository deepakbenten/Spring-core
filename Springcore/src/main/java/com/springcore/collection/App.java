package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	

	public static void main(String[] args) {
		ApplicationContext context1 = new ClassPathXmlApplicationContext("com/springcore/collection/collection-config.xml");
		Emp emp1 = (Emp) context1.getBean("emp1");
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getAddreses());
		System.out.println(emp1.getCourses());
	}

}
