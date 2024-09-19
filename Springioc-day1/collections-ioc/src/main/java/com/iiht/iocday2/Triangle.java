package com.iiht.iocday2;

public class Triangle implements Shape {
	
	private double heigth;
	private double base;

	
	public Triangle() {
		super();
	}

	public Triangle(double heigth, double base) {
		super();
		this.heigth = heigth;
		this.base = base;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public String toString() {
		return "Triangle [heigth=" + heigth + ", base=" + base + "]";
	}

	@Override
	public double area() {
		
		return 0.5 * this.heigth * this.base;
	}

	@Override
	public String getShape() {
		// TODO Auto-generated method stub
		return null;
	}

}
