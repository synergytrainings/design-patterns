package com.synisys.trainings.Iterator;

public class Demo {
	public static void main(String[] args) {
		CategoryCollection categories = new CategoryCollectionImpl();
    	categories.addCategory(new Category("Project 1", "First Project" , CategoryType.PROJECT));
    	categories.addCategory(new Category("Activity 1", "First Activity" , CategoryType.ACTIVITY));
    	categories.addCategory(new Category("Project 2", "Second Project" , CategoryType.PROJECT));
    	categories.addCategory(new Category("Activity 2", "Second Activity" , CategoryType.ACTIVITY));
    	categories.addCategory(new Category("Project 3", "Third Project" , CategoryType.PROJECT));
    	categories.addCategory(new Category("Activity 3", "Third Activity" , CategoryType.ACTIVITY));
    	categories.addCategory(new Category("Project 4", "Forth Project" , CategoryType.PROJECT));
    	categories.addCategory(new Category("Activity 4", "Forth Activity" , CategoryType.ACTIVITY));
    	categories.addCategory(new Category("Activity 5", "Fifth Activity" , CategoryType.ACTIVITY));
        CategoryIterator baseIterator = categories.iterator(CategoryType.PROJECT);
        while (baseIterator.hasNext()) {
        	Category c = baseIterator.next();
            c.insert();
        }
        System.out.println();
        CategoryIterator englishIterator = categories.iterator(CategoryType.ACTIVITY);
        while (englishIterator.hasNext()) {
        	Category c = englishIterator.next();
            c.insert();
        }
    }
 
}
