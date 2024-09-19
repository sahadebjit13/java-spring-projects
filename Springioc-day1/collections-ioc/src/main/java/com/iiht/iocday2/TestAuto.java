package com.iiht.iocday2;

import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.iiht.ioc.A;
import com.iiht.ioc.Members;

public class TestAuto {

	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger("TestAuto");
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		Object obj = context.getBean("javaTeam");
		Line line = (Line) obj;
		
		logger.info(line + "");
		
	}

}
