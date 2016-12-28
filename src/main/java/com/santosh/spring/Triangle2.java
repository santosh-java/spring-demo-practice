package com.santosh.spring;

public class Triangle2 {
	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Triangle with 3 points \n");
		System.out.println("Point A :" + getPointA().toString());
		System.out.println("Point B :" + getPointB().toString());
		System.out.println("Point C :" + getPointC().toString());
	}
}
