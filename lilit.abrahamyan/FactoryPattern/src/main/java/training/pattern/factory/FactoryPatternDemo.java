package main.java.training.pattern.factory;

import main.java.training.pattern.factory.api.ProjectFactory;
import main.java.training.pattern.factory.api.ProjectType;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		//draw project plan for financial project
		ProjectFactory.buildProject(ProjectType.FINANCIAL).drawProjectPlan();
		//draw project plan for training project
		ProjectFactory.buildProject(ProjectType.TRAINING).drawProjectPlan();
	}

}
