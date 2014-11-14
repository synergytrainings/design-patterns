package com.synisys.trainings.designPatterns.adapter.impl;

import com.synisys.trainings.designPatterns.adapter.interfaces.MapView;
import com.synisys.trainings.designPatterns.adapter.interfaces.Measure;

public class MapViewImpl implements MapView{
	private Measure measure = null;
	private String adminBorderId = null;

	public String drawScaling(String jsonData) {
		return "Scaling is applied!";
	}

	public void setScalingMeasure(Measure measure) {
		this.measure = measure;
	}

	public Measure getScalingMeasure() {
		return this.measure;	
	}
	
	public String getAdminBorderId() {
		if(adminBorderId == null){
			loadAdminBorderId();
		}
		return this.adminBorderId;
	}

	private void loadAdminBorderId() {
		this.adminBorderId = "Region";		
	}
	

}
