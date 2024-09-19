package com.iiht.ioc.annotationsjavaconfig;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestComponents {
	
	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger("TestComponents");
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		logger.info(context.toString());
		
		logger.info(context.getBean(ATnTSim.class)+"");
		
		//logger.info(context.getBean("aTnTSim")+"");
		
		logger.info(context.getBean("atntsim")+"");
		
		Mobile iphone14 = (Mobile) context.getBean("iphone14");
		
		iphone14.turnOn();
	}

}
