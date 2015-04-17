package com.synisys.trainings.templateMethod.impl;



public class PieChart extends ChartImpl {
	private final int minSize = 50;
	private final int maxSize = 100;
	

	@Override
	int getMinSize() {
		return this.minSize;
	}

	@Override
	int getMaxSize() {
		return this.maxSize;
	}

	@Override
	void drawChart(Position centerPosition, double size) {
		Circle circle = new Circle(size); 
		circle.render(centerPosition);
	}
	
}
