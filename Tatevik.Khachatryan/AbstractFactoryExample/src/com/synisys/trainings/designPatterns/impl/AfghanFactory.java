package com.synisys.trainings.designPatterns.impl;

import com.synisys.trainings.designPatterns.AbstractDashboard;
import com.synisys.trainings.designPatterns.AbstractFactory;

public class AfghanFactory implements AbstractFactory{		
	@Override
	public AbstractDashboard createDashboard() {
		return new AfghanDashboard();
	}
}
