package com.synisys.trainings.Visitor;

public class CategoryVisitorImpl implements CategoryVisitor{
	public String visit(Project project) {
		System.out.println("Project is visited");
		return null;
	}

	public String visit(Activity activity) {
		System.out.println("Activity is visited");
		return null;
	}
}
