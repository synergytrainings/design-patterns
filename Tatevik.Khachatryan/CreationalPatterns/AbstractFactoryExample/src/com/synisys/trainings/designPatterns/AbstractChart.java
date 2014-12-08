package com.synisys.trainings.designPatterns;

public abstract class AbstractChart {
	/**
	 * Holds current chart name
	 */
	private final String chartName;
	
	public AbstractChart(String chartName){
		this.chartName = chartName;
	}
	
	/**
	 * 
	 * @return this Chart Name
	 */
	public String getChartName(){
		return this.chartName;
	}
		
	/**
	 * Draws this chart
	 */
	public abstract void draw();
	
	/**
	 * Changes this chart color scheme
	 */
	public abstract void changeColorScheme();
}
