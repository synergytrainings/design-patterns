package com.synisys.trainings.designPatterns.bridge.impl;

public class DashboardMap extends MapTabContent {

	public DashboardMap(MapController mapController) {
		super(mapController);
	}
	
	public String drawNoPermissionMessage(){
		return "You have no permission to view this item";
	} 

}
