package com.iiht.ioc.annotationsjavaconfig;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("tmobile")
//@Primary
public class TMobile implements Sim {

	@Override
	public boolean connect() {
		
		return true;
	}

}
