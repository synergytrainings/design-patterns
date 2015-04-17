package com.synisys.trainings.templateMethod.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.synisys.trainings.templateMethod.impl.BarChart;
import com.synisys.trainings.templateMethod.impl.ChartImpl;
import com.synisys.trainings.templateMethod.impl.PieChart;
import com.synisys.trainings.templateMethod.impl.Position;

public class Main {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		List<Integer> chartValues = new ArrayList<Integer>();
		chartValues.add(10);
		chartValues.add(50);
		chartValues.add(100);
		List<Position> centroids = new ArrayList<Position>();
		centroids.add(new Position(10, 10));
		centroids.add(new Position(40, 40));
		centroids.add(new Position(110, 110));
		
		PieChart pieChart = new PieChart();
		pieChart.render(chartValues, centroids);
		
		BarChart barChart = new BarChart();
		barChart.render(chartValues, centroids);
	}

}
