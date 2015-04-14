package com.synisys.trainings.strategy.impl;

import java.security.InvalidAlgorithmParameterException;

import com.synisys.trainings.strategy.interfaces.ScalingAlgorthim;
import com.synisys.trainings.strategy.interfaces.ScalingDataController;

public class LinearScalingAlgorithm implements ScalingAlgorthim {

	public String getScalingData(String data, ScalingDataController scalingDataController) {
		String color = scalingDataController.getScalingColor();
		return  data +  " is processed linearly using " + color + " as color"; 
	}

}
