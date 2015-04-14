package com.synisys.trainings.strategy.impl;

import java.util.List;

import com.synisys.trainings.strategy.interfaces.ScalingAlgorthim;
import com.synisys.trainings.strategy.interfaces.ScalingDataController;

public class ScalingDataControllerImpl implements ScalingDataController {
	private ScalingAlgorthim scalingAlgorthim;
	private String scalingColor = null;
	private List<CustomColor> customColors = null;
	
	public String getScalingData(String data) {
		return this.scalingAlgorthim.getScalingData(data, this);
	}

	public void setScalingAlgorthim(ScalingAlgorthim scalingAlgorthim) {
		this.scalingAlgorthim = scalingAlgorthim;
	}

	public String getScalingColor() {
		return scalingColor;
	}

	public void setScalingColor(String scalingColor) {
		this.scalingColor = scalingColor;
	}

	public List<CustomColor> getCustomColors() {
		return customColors;
	}

	public void setCustomColors(List<CustomColor> customColors) {
		this.customColors = customColors;
	}

	
}
