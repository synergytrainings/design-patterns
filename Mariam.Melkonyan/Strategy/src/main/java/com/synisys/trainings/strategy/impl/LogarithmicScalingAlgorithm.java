package com.synisys.trainings.strategy.impl;

import com.synisys.trainings.strategy.interfaces.ScalingAlgorthim;
import com.synisys.trainings.strategy.interfaces.ScalingDataController;

public class LogarithmicScalingAlgorithm implements ScalingAlgorthim {

	public String getScalingData(String data, ScalingDataController scalingDataController) {
		String color = scalingDataController.getScalingColor();
		return  data +  "is processed logarithmically using " + color + "as color"; 
	}

}
