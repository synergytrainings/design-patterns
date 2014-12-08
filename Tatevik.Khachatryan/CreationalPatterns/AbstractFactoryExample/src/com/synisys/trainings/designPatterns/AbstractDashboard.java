package com.synisys.trainings.designPatterns;

import java.util.ArrayList;

public abstract class AbstractDashboard {
	/**
	 * holds this dashboard charts and maps
	 */
	ArrayList<Object> dashboardObjects = new ArrayList<>();
	
	/**
	 * 
	 * @return dashboard objects to use in child classes
	 */
	protected ArrayList<Object> getDashboardObjects(){
		return this.dashboardObjects;
	}
	
	/**
	 * Crates new Chart and adds it to the Dashboard
	 * @param chartName new chart name
	 */
	public abstract void addChart(String chartName);
	
	/**
	 * Crates new Map and adds it to the Dashboard
	 * @param mapName new map name
	 */
	public abstract void addMap(String mapName);
	
	/**
	 * Draws dashboard all elements (charts and maps)
	 */		
	public void drawDashboard() {
		for (Object dashboardObj : dashboardObjects) {
			if (dashboardObj != null && dashboardObj instanceof AbstractChart) {
				//draw chart
				((AbstractChart) dashboardObj).draw();
			} else if (dashboardObj != null
					&& dashboardObj instanceof AbstractMap) {
				//draw map
				((AbstractMap) dashboardObj).draw();
			} else { // shouldn't be such case!
				throw new RuntimeException("Unknown Element!");
			}
		}
	}
}
