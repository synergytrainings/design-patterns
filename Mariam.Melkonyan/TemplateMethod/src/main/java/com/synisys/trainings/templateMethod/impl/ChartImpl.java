package com.synisys.trainings.templateMethod.impl;

import java.util.List;

import com.synisys.trainings.tempateMethod.interfaces.Chart;

public abstract class ChartImpl implements Chart {
	private int minValue; 
	private int maxValue;

	public void render(List<Integer> chartValues, List<Position> centroids) {
		calculateMinAndMaxValues(chartValues);
		
		for(int i = 0; i < chartValues.size(); i++){
			double mappedValue = getMappedValue(chartValues.get(i));
			drawChart(centroids.get(i), mappedValue);
		}
	}

	abstract  int getMinSize();

	abstract int getMaxSize(); 
	
	abstract void drawChart(Position centerPosition, double size); 
	
	private void calculateMinAndMaxValues(List<Integer> chartValues){
		minValue = Integer.MAX_VALUE;
		maxValue = 0;
		
		for(int i = 0; i < chartValues.size(); i++){
			int chartValue = chartValues.get(i);
			if(chartValue > maxValue){
				maxValue = chartValue;
			}
			if(chartValue < minValue){
				minValue = chartValue;
			}
		}
	}
	
	private double getMappedValue(int value){
		 
		int maxSize = this.getMaxSize();
		int minSize = this.getMinSize();
		double a = (double)(maxSize - minSize) / (maxValue - minValue);
		double b = maxSize - a * maxValue;
		double mappedValue = a * value + b;
		return mappedValue;
	}

}
