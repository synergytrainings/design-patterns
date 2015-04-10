package main.com.synisys.trainings.designPatterns.impl;

import main.com.synisys.trainings.designPatterns.State;

public class ViewModeState implements State{

	@Override
	public void printForm(Context context) {
		System.out.println("Project is in view mode... Just print project form...");
	}
	
}
