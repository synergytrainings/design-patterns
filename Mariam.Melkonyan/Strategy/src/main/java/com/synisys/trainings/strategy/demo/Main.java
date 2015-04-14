package com.synisys.trainings.strategy.demo;

import java.util.ArrayList;
import java.util.List;

import com.synisys.trainings.strategy.impl.CustomColor;
import com.synisys.trainings.strategy.impl.DiscreteScalingAlgorithm;
import com.synisys.trainings.strategy.impl.LinearScalingAlgorithm;
import com.synisys.trainings.strategy.impl.ScalingDataControllerImpl;
import com.synisys.trainings.strategy.interfaces.ScalingAlgorthim;
import com.synisys.trainings.strategy.interfaces.ScalingDataController;


public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		ScalingDataController scalingDataController = new ScalingDataControllerImpl();
		ScalingAlgorthim linearScalingAlgorthim =  new LinearScalingAlgorithm();
		scalingDataController.setScalingAlgorthim(linearScalingAlgorthim);
		scalingDataController.setScalingColor("FF0000");
		System.out.println(scalingDataController.getScalingData("test"));
		
		List<CustomColor> customColors = new ArrayList<CustomColor>();
		CustomColor customColor1 = new CustomColor("00FF00", 10, 20);
		customColors.add(customColor1);
		CustomColor customColor2 = new CustomColor("0000FF", 20, 30);
		customColors.add(customColor2);
		ScalingAlgorthim discreteScalingAlgorthim =  new DiscreteScalingAlgorithm();
		scalingDataController.setScalingAlgorthim(discreteScalingAlgorthim);
		scalingDataController.setCustomColors(customColors);
		System.out.println(scalingDataController.getScalingData("test"));
		
		
	}


}
