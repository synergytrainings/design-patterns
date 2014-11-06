package main.java.training.pattern.factory.impl;

import main.java.training.pattern.factory.api.Project;

public class TrainingProject implements Project{

	@Override
	public void drawProjectPlan() {
		System.out.println("draw project plan for training project");
	}
}
