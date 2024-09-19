package com.iiht.iocAnnotations;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotationConfig {

	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger("TestAnnotation");
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans-cp.xml");
		
		Object obj = context.getBean(LifeCycleAnnotations.class);
		
		logger.info(obj.toString());

	}
}
