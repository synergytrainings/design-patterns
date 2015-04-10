package main.com.synisys.trainings.designPatterns.impl;

import main.com.synisys.trainings.designPatterns.State;

public class EditModeState implements State{

	@Override
	public void printForm(Context context) {
		System.out.println("Project is in edit mode... Format form layout, then print project...");
	}

}
