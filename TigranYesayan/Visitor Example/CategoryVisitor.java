package com.synisys.trainings.Visitor;

public interface CategoryVisitor {
	public String visit(Project project);
	public String visit(Activity activity);
}
