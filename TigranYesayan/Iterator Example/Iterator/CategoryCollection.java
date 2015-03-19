package com.synisys.trainings.Iterator;

public interface CategoryCollection {

	public void addCategory(Category category);
	public void deleteCategory(Category category);
	public CategoryIterator iterator(CategoryType type);
}
