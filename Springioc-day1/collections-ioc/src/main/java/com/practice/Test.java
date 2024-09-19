package com.practice;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.iiht.ioc.annotationsjavaconfig.AppConfig;

public class Test {

	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger("Test");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		//logger.info(context.toString());
		logger.info(context.getBean("p1")+"");
		logger.info(context.getBean("p2")+"");
		logger.info(context.getBean("Line")+"");
		
		//logger.info(context.toString());
		
		Line line = (Line) context.getBean("Line");
		
		line.drawLine();
	}
}
