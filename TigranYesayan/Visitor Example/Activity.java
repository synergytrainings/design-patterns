package com.synisys.trainings.Visitor;

public class Activity implements Category {
	public String accept(CategoryVisitor visitor) {
		return visitor.visit(this);
	}
}
