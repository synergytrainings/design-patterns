package com.synisys.trainings.observer.impl;

import com.synisys.trainings.observer.interfaces.Observer;

public class ChartView implements Observer {

	public void update(Integer adminBorderId) {
		System.out.println("Reloads chart the data according to admin border " + adminBorderId);
		paint();
	}

	private void paint() {
		System.out.println("Paints the charts");		
	}

}
