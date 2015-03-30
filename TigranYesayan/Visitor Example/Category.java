package com.synisys.trainings.Visitor;

public interface Category {
	public String accept(CategoryVisitor visitor);
}
