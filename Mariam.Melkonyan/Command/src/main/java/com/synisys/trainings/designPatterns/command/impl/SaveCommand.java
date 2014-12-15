package com.synisys.trainings.designPatterns.command.impl;

import com.synisys.trainings.designPatterns.command.api.Command;

public class SaveCommand implements Command {

	public void onOkClicked() {
		System.out.println("The current executing report is saved !!");

	}

	public void onCancelClicked() {
		System.out.println("All the changes are lost !!");

	}

}
