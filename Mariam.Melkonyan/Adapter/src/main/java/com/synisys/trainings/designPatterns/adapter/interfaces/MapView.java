package com.synisys.trainings.designPatterns.adapter.interfaces;


public interface MapView {
	public String drawScaling(String jsonData);
	public void setScalingMeasure(Measure measure);
	public String getAdminBorderId();
}
