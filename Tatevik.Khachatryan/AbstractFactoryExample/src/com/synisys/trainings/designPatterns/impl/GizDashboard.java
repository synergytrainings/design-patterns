package com.synisys.trainings.designPatterns.impl;

import com.synisys.trainings.designPatterns.*;

public class GizDashboard extends AbstractDashboard{
	@Override
	public void addChart(String chartName) {
		AbstractChart chart = new GizChart(chartName);
		
		System.out.println(String.format("Adding %s chart to GIZ Dashboard\n", chartName));
		getDashboardObjects().add(chart);
	}

	@Override
	public void addMap(String mapName) {
		AbstractMap map = new GizMap(mapName);
		
		System.out.println(String.format("Adding %s chart to GIZ Dashboard\n", mapName));
		getDashboardObjects().add(map);		
	}	
	
	public void drawDashboard() {
		System.out.println("\nDrawing GIZ Dashboard...");
		super.drawDashboard();
	}
}
