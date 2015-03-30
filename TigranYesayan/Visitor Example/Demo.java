package com.synisys.trainings.Visitor;

public class Demo {
	public static void main(String[] args) {
		Category[] categories = new Category[]{new Project(),new Activity()};
		CategoryVisitor visitor = new CategoryVisitorImpl();
		for(Category category : categories){
			category.accept(visitor);
		}
	}
}
