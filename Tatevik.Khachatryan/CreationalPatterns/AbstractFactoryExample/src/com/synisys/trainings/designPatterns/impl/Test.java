package com.synisys.trainings.designPatterns.impl;

import com.synisys.trainings.designPatterns.AbstractDashboard;
import com.synisys.trainings.designPatterns.AbstractFactory;

public class Test {
	private static final AbstractFactory afghanFactory = new AfghanFactory();
	private static final AbstractFactory gizFactory = new GizFactory();
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractDashboard afghanDashboard = afghanFactory.createDashboard();
		afghanDashboard.addChart("Chart1");
		afghanDashboard.addChart("Chart2");
		afghanDashboard.addMap("Map1");
		
		AbstractDashboard gizDashboard = gizFactory.createDashboard();
		gizDashboard.addChart("Chart1");
		gizDashboard.addMap("Map1");
		gizDashboard.addMap("Map2");
		
		afghanDashboard.drawDashboard();
		gizDashboard.drawDashboard();
	}

}
