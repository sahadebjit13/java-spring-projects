package com.practice;

import org.springframework.stereotype.Component;

//@Component("Point")
public class Point {
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	private int x;
	private int y;
	
	public Point() {
		super();
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	

}
