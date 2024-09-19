package com.iiht.jdbcannotationconfig;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
		System.out.println(context.getBean("dao"));
		JDBCService service = (JDBCService) context.getBean("service");
		service.getData();

	}

}
