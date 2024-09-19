package com.iiht.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeans {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Object obj = context.getBean("javaTeam");
		Members team = (Members) obj;
		System.out.println(team);
		
		A a1 = (A) context.getBean("a1");
		System.out.println(a1);
		
		A a2 = (A) context.getBean("a2");
		System.out.println(a2);
		
		System.out.println(context.getBean("a3"));
		System.out.println(context.getBean("a4"));
	}

}
