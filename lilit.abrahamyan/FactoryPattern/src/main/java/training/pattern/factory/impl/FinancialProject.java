package main.java.training.pattern.factory.impl;

import main.java.training.pattern.factory.api.Project;

public class FinancialProject implements Project{

	@Override
	public void drawProjectPlan() {
		System.out.println("draw project plan for financial project");
	}
}
