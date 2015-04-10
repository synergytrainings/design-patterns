package com.synisys.trainings.observer.impl;

import com.synisys.trainings.observer.interfaces.Observer;

public class ScalingView implements Observer {

	public void update(Integer adminBorderId) {
		System.out.println("Reloads scaling the data according to admin border " + adminBorderId);
		paint();
	}

	private void paint() {
		System.out.println("Colors the locations");		
	}

}
