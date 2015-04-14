package com.synisys.trainings.strategy.impl;

public class CustomColor {
	private String color;
	private int minValue;
	private int maxValue;

	public CustomColor(String color, int minValue, int maxValue) {
		this.color = color;
		this.minValue = minValue;
		this.maxValue = maxValue;
	}

	public String getColor() {
		return color;
	}
	
	public int getMinValue() {
		return minValue;
	}
	
	public int getMaxValue() {
		return maxValue;
	}
	
	@Override
	public String toString() {
		return "Color = " + this.color +
				"Min value = " + this.minValue +
				"Max Value = " + this.maxValue;
	}
	
}
