package com.santosh.spring;

import java.util.List;

public class Triangle2 {
	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw() {
		System.out.println("Triangle with 3 points \n");
		for (Point p : points) {
			System.out.println("Point :" + p.toString());
		}
	}
}
