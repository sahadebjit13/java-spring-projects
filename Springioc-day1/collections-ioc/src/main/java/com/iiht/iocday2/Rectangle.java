/**
 * 
 */
package com.iiht.iocday2;

import java.util.logging.Logger;

/**
 * 
 */
public class Rectangle implements Shape {

	private double length;
	private double breadth;
	
	Logger logger = Logger.getLogger("Rectangle");
	
	public Rectangle() {
		super();
	}

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}

	@Override
	public double area() {
		return this.length * this.breadth;
	}

	@Override
	public String getShape() {

		return getClass().getName();
	}
	
	
	public void init() {
		
		logger.info("init() called");
	}
	
	public void destroy() {
		logger.info("destroy() called");
	}
	
}
