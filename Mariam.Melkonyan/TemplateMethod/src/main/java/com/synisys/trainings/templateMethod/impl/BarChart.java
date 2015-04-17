package com.synisys.trainings.templateMethod.impl;


public class BarChart extends ChartImpl {
	private final int minSize = 50;
	private final int maxSize = 100;

	@Override
	int getMinSize() {
		return minSize;
	}

	@Override
	int getMaxSize() {
		return maxSize;
	}

	@Override
	void drawChart(Position leftCornerPosition, double size) {
		Rectangle rectangle = new Rectangle(size, 15);
		rectangle.render(leftCornerPosition);
	}
}
