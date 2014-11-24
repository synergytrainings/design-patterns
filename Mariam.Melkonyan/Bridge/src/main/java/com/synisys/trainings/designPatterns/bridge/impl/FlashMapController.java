package com.synisys.trainings.designPatterns.bridge.impl;

public class FlashMapController extends MapController{

	@Override
	public String getMapView() {
		return "FlashMap";
	}

	@Override
	public String getMinimapView() {
		return "FlashMiniMap";
	}

}
