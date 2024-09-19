package com.iiht.iocAnnotations;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnector {
	
	Logger logger = Logger.getLogger("JdbcConnector");
	
	@PostConstruct
	public void myInit() {
		logger.info("init() called");
	}
	
	@PreDestroy
	public void myDestroy() {
		logger.info("destroy() called");
	}

}
