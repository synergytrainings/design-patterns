package com.synisys.trainings.designPatterns.facade;

import java.util.List;

public class MapFacade {
	
	public String drawMap(String adminBorder){
		MapView mapView = new MapView();
		mapView.setAdminBorder(adminBorder);
		return mapView.draw();
	}
	
	public String drawMapBuilder(List<String> scaleMeasures, List<String> chartMeasures){
		Mapbuilder mapbuilder = new Mapbuilder();
		mapbuilder.setChartMeasures(chartMeasures);
		mapbuilder.setScaleMeasures(scaleMeasures);
		return mapbuilder.draw();
	} 
}
