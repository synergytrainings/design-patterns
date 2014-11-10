package com.synisys.training.patterns.prototype;


public class Square extends Shape {

	private final int side;
	private static final double outerCircleRadiusRelation = Math.sqrt(2);

	public Square(int side, String color, Boolean isFilled){
		super(color, isFilled);
		this.side = side;
		this.outerCircle = new Circle(side / outerCircleRadiusRelation);
	}

	public int getSide() {
		return side;
	}

	/**
	 * Shallow clone
	 */
	@Override
	public Square clone(){
		return (Square) super.clone();
	}

	@Override
	public void draw() {
		System.out.println("Draw Square.");
	}
}