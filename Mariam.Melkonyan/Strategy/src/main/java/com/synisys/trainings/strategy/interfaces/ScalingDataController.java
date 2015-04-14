package com.synisys.trainings.strategy.interfaces;

import java.util.List;

import com.synisys.trainings.strategy.impl.CustomColor;

public interface ScalingDataController {
	public String getScalingData(String data);
	
	public String getScalingColor();

	public void setScalingColor(String scalingColor);
	
	public List<CustomColor> getCustomColors();

	public void setCustomColors(List<CustomColor> customColors);

	public void setScalingAlgorthim(ScalingAlgorthim scalingAlgorthim);

}
