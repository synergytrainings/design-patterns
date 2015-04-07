package com.synisys.trainings.observer.demo;


import com.synisys.trainings.observer.impl.ChartView;
import com.synisys.trainings.observer.impl.MapModel;
import com.synisys.trainings.observer.impl.ScalingView;
import com.synisys.trainings.observer.interfaces.Observer;

public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		MapModel mapModel = new MapModel();
		
		Observer chartView = new ChartView();
		mapModel.attach(chartView);
		
		Observer mapView = new ScalingView();
		mapModel.attach(mapView);
		
		mapModel.setAdminBorderId(5);
	}


}
