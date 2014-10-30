package com.synisys.trainings.designPatterns.impl;

import com.synisys.trainings.designPatterns.*;

public class AfghanDashboard extends AbstractDashboard{	
	@Override
	public void addChart(String chartName) {		
		AbstractChart chart = new AfghanChart(chartName);
		
		System.out.println(String.format("Adding %s chart to Afghan Dashboard\n", chartName));
		getDashboardObjects().add(chart);
	}

	@Override
	public void addMap(String mapName) {
		AbstractMap map = new AfghanMap(mapName);
		
		System.out.println(String.format("Adding %s map to Afghan Dashboard\n", mapName));
		getDashboardObjects().add(map);		
	}
	
	public void drawDashboard() {
		System.out.println("\nDrawing Afghan Dashboard...");
		super.drawDashboard();
	}
	
}
