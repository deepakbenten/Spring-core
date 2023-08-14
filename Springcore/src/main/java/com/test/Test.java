package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test/configs.xml");
		Student s = (Student)context.getBean("student1",Student.class);
		System.out.println(s.hashCode());
		System.out.println(s.hashCode());
	}

}
