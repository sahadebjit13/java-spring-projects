package com.practice;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Line")
public class Line {

	Logger logger = Logger.getLogger("Line");
	
	@Autowired
	//@Qualifier("p1")
	private Point p1;
	
	@Autowired
	//@Qualifier("p2")
	private Point p2;
	
	/*
	 * public Line(Point p1, Point p2) { super(); this.p1 = p1; this.p2 = p2; }
	 */


	public Line() {
		super();
	}
	
	



	public Logger getLogger() {
		return logger;
	}





	public void setLogger(Logger logger) {
		this.logger = logger;
	}





	public Point getP1() {
		return p1;
	}





	public void setP1(Point p1) {
		this.p1 = p1;
	}





	public Point getP2() {
		return p2;
	}





	public void setP2(Point p2) {
		this.p2 = p2;
	}





	public Line(Point p1, Point p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}





	@Override
	public String toString() {
		return "Line [logger=" + logger + ", p1=" + p1 + ", p2=" + p2 + "]";
	}





	public void drawLine() {
		
		logger.info(p1 + " " + p2);
	}
}
