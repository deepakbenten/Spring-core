package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/spel/spel-config.xml");
		Demo demo = context.getBean("ob",Demo.class);
		System.out.println(demo);
		
		
		
		System.out.println("_____________________________________________________________");
		SpelExpressionParser s1 = new SpelExpressionParser();
		Expression temp = s1.parseExpression("10+25");
		System.out.println(temp.getValue());
		
		
	}

}
