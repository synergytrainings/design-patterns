package com.synisys.trainings.strategy.impl;

import java.util.List;

import com.synisys.trainings.strategy.interfaces.ScalingAlgorthim;
import com.synisys.trainings.strategy.interfaces.ScalingDataController;

public class DiscreteScalingAlgorithm implements ScalingAlgorthim {

	public String getScalingData(String data, ScalingDataController scalingDataController) {
		List<CustomColor> colors = scalingDataController.getCustomColors();
		String result = "";
		for (CustomColor customColor : colors) {
			result += customColor.toString();
			result += ", ";
		}
		result += "custom colors were used to process data " + data;
		return result;
	}

}
