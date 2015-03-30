package com.synisys.trainings.Visitor;

public class Project implements Category {
	public String accept(CategoryVisitor visitor) {
		return visitor.visit(this);
	}
}
