package com.synisys.training.patterns.prototype;

public abstract class Shape implements Cloneable {

	protected String color = "RED";
	protected Boolean isFilled = false;
	protected Circle outerCircle;

	Shape(String color, Boolean isFilled) {
		this.color = color;
		this.isFilled = isFilled;
	}

	Shape() {
	}

	abstract void draw();

	public Boolean isFilled() {
		return isFilled;
	}

	public String getColor() {
		return color;
	}

	public Circle getOuterCircle() {
		return outerCircle;
	}

	public Shape clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			throw new AssertionError(e);
		}
		return (Shape) clone;
	}
}