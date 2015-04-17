package com.synisys.trainings.templateMethod.impl;

public class Position {
	private int coordinateX;
	private int coordinateY;
	
	
	public Position(int coordinateX, int coordinateY) {
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
	}

	public int getCoordinateX() {
		return coordinateX;
	}
	
	public int getCoordinateY() {
		return coordinateY;
	}
	
	@Override
	public String toString() {
		return "(" + this.coordinateX + ", " + this.coordinateY + ")";
	}
	
}
