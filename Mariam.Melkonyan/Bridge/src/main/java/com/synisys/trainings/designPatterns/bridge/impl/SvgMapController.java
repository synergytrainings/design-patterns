package com.synisys.trainings.designPatterns.bridge.impl;

public class SvgMapController extends MapController {
	@Override
	public String getMapView() {
		return "SvgMap";
	}

	@Override
	public String getMinimapView() {
		return "SvgMiniMap";
	}
}
