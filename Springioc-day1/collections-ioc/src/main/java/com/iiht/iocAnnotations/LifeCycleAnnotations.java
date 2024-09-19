package com.iiht.iocAnnotations;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifeCycleAnnotations {
	
	Logger logger = Logger.getLogger("LifeCycleAnnotations");
	
	
	
	public LifeCycleAnnotations() {
		logger.info("from default constructor");
	}

	@PostConstruct
	public void myInit() {
		
		logger.info("init() called");
		
	}
	
	@PreDestroy
	public void myDestroy() {
		
		logger.info("destroy() called");
	}

}
