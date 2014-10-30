package com.synisys.trainings.designPatterns.impl;

import com.synisys.trainings.designPatterns.AbstractChart;

public class AfghanChart extends AbstractChart{
	private final static String PREFIX = "AFG-";
	
	AfghanChart(String name){
		super(PREFIX + name);		
		System.out.println(String.format("Initializing Afghan Chart %s...", name));
	}
	
	@Override
	public void draw() { 
		System.out.println(String.format("Drawing Afghan Chart %s...", this.getChartName()));
	}
	
	@Override
	public void changeColorScheme() { 
		System.out.println(String.format("Changing Color Scheme for Afghan Chart %s...", this.getChartName()));
	}
}
