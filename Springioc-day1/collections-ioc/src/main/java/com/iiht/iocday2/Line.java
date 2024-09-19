package com.iiht.iocday2;

public class Line {

	private Point startingPoint;
	private Point endingPoint;
	
	
	public Line() {
		super();
	}


	public Line(Point startingPoint, Point endingPoint) {
		super();
		this.startingPoint = startingPoint;
		this.endingPoint = endingPoint;
	}


	public Point getStartingPoint() {
		return startingPoint;
	}


	public void setStartingPoint(Point startingPoint) {
		this.startingPoint = startingPoint;
	}


	public Point getEndingPoint() {
		return endingPoint;
	}


	public void setEndingPoint(Point endingPoint) {
		this.endingPoint = endingPoint;
	}


	@Override
	public String toString() {
		return "Line [startingPoint=" + startingPoint + ", endingPoint=" + endingPoint + "]";
	}
	
	
	
	
}
