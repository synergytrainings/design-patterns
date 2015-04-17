package com.synisys.trainings.templateMethod.impl;

public class Circle {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public void render(Position position){
		System.out.println("Circle with radius " + this.radius + " is rendered in position " + position.toString()); 
	}
}
