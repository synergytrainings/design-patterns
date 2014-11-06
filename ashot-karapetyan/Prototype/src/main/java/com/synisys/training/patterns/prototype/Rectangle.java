package com.synisys.training.patterns.prototype;


public class Rectangle extends Shape {

	private final int length;
	private final int width;

	public Rectangle(int length, int width, String color, Boolean isFilled){
		super(color, isFilled);
		this.length = length;
		this.width = width;
		this.outerCircle = new Circle(getOuterCircleRadius());
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	private double getOuterCircleRadius(){
		return Math.sqrt(width * width + length * length) / 2;
	}


	/**
	 * Deep clone
	 */
	@Override
	public Rectangle clone(){
		Rectangle clone =  (Rectangle) super.clone();
		clone.outerCircle = new Circle(getOuterCircleRadius());
		return clone;
	}

	@Override
	public void draw() {
		System.out.println("Draw Rectangle.");
	}
}