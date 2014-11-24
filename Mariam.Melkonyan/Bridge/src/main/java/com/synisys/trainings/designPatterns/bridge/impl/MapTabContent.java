package com.synisys.trainings.designPatterns.bridge.impl;

import com.synisys.trainings.designPatterns.bridge.api.MapContent;

public class MapTabContent implements MapContent{
	protected MapController mapController;
	
	public MapTabContent(MapController mapController){
		this.mapController = mapController;
	}
	public String drawMap() {
		return this.mapController.getMapView() + " " + this.mapController.getMinimapView();
	}
	
	

}
