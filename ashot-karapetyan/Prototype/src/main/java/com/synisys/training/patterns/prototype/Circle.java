package com.synisys.training.patterns.prototype;


public class Circle extends Shape {

	private final double radius;

	public Circle(double radius, String color, Boolean isFilled){
		super(color, isFilled);
		this.radius = radius;
	}

	public Circle(double radius){
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public Circle clone(){
		return (Circle) super.clone();
	}

	@Override
	public void draw() {
		System.out.println("Draw Circle.");
	}
}