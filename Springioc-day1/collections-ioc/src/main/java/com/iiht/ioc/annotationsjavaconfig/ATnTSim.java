package com.iiht.ioc.annotationsjavaconfig;

import org.springframework.stereotype.Component;

// POJO - bean - Component
@Component("atntsim")
public class ATnTSim implements Sim {

	@Override
	public boolean connect() {
		
		return true;
	}

}
