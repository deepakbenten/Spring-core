package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/stereotype/stereo-config.xml");
		Student student = context.getBean("ob",Student.class);
//		System.out.println(student);
//		System.out.println(student.getAddress());
		/*
		 * System.out.println(student.hashCode()); Student student2 =
		 * context.getBean("tech",Student.class);
		 * System.out.println(student2.hashCode());
		 */
		
		
		teacher t1 = context.getBean("tech",teacher.class);
		System.out.println(t1.hashCode());
		teacher t2 = context.getBean("tech",teacher.class);
		System.out.println(t2.hashCode());
	}
}
