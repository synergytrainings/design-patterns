package com.synisys.trainings.templateMethod.impl;

public class Rectangle {
	private double height;
	private int width;

	public Rectangle(double height, int width) {
		this.height = height;
		this.width = width;
	}
	

	public void render(Position leftTopCorner){
		System.out.println("Rectange " + this.width + "x" + this.height + " is rendered in position " + leftTopCorner.toString()); 
	}
}
