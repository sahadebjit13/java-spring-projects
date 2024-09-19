package com.iiht.iocday2;

import java.util.logging.Logger;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestShape {

	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger("TestShape");
		
		BeanFactory factory = new FileSystemXmlApplicationContext("beans.xml");
		/*
		 * ClassPathXmlApplicationContext factory = new
		 * ClassPathXmlApplicationContext("beans.xml"); factory.registerShutdownHook();
		 */
		
		//System.out.println(factory);
		logger.info(factory+"");
		
		Shape s = (Rectangle) factory.getBean("rect");
		//Shape s = new Rectangle(25.876, 75.8987);
		//System.out.println(s);
		logger.info(s.toString());
		
		double result = s.area();
		//System.out.println(result);
		logger.info(result+"");
		
		String gs = s.getShape();
		//System.out.println(gs);
		logger.info(gs);
		
		Shape a = (Triangle) factory.getBean("tri");
		//Shape a = new Triangle(20.876, 10.8987);
		//System.out.println(a);
		logger.info(a.toString());
		
		double resulttri = a.area();
		//System.out.println(resulttri);
		logger.info(resulttri + "");
		
		String gst = a.getShape();
		//System.out.println(gst);
		logger.info(gst);
		
		Shape rh = (Rhombus) factory.getBean("rho");
		//System.out.println(rh);
		logger.info(rh.toString());
		
		double resultrh = rh.area();
		//System.out.println(resultrh);
		logger.info(resultrh+"");
		
		String gsrh = rh.getShape();
		System.out.println(gsrh);
		logger.info(gsrh);
		
		

	}

}
