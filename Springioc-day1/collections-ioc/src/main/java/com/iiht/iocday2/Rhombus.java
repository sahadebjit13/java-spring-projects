package com.iiht.iocday2;

public class Rhombus implements Shape {
	
	private double heigth;
	private double base;

	
	public Rhombus() {
		super();
	}

	public Rhombus(double heigth, double base) {
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
		return "Rhombus [heigth=" + heigth + ", base=" + base + "]";
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.heigth * this.base;
	}

	@Override
	public String getShape() {
		// TODO Auto-generated method stub
		return null;
	}

}
