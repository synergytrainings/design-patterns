package com.synisys.trainings.designPatterns.impl;

import com.synisys.trainings.designPatterns.AbstractChart;

public class GizChart extends AbstractChart{
	private final static String PREFIX = "GIZ-";
	
	GizChart(String name){
		super(PREFIX + name);		
		System.out.println(String.format("Initializing GIZ Chart %s...", name));
	}
	
	@Override
	public void draw() { 
		System.out.println(String.format("Drawing GIZ Chart %s...", this.getChartName()));
	}
	
	@Override
	public void changeColorScheme() { 
		System.out.println(String.format("Changing Color Scheme for GIZ Chart %s...", this.getChartName()));
	}
}
