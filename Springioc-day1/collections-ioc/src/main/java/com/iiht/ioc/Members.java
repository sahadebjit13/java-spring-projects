package com.iiht.ioc;

import java.util.ArrayList;
import java.util.List;

public class Members {
	
	List<A> members = new ArrayList<>();
	
	public Members() {
		// TODO Auto-generated constructor stub
	}

	public Members(List<A> members) {
		super();
		this.members = members;
	}

	@Override
	public String toString() {
		return "Members [members=" + members + "]";
	}

	public List<A> getMembers() {
		return members;
	}

	public void setMembers(List<A> members) {
		this.members.addAll(members); // appends to the existing list which was created during constructor injection
	}
	
	
	
	

}
