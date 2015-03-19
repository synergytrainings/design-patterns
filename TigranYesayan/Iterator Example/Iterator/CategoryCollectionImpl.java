package com.synisys.trainings.Iterator;

import java.util.ArrayList;
import java.util.List;

public class CategoryCollectionImpl implements CategoryCollection{
	
	private List<Category> categoriesList;
	
	public CategoryCollectionImpl(){
		categoriesList = new ArrayList<>();
	}

	@Override
	public void addCategory(Category category) {
		this.categoriesList.add(category);
	}

	@Override
	public void deleteCategory(Category category) {
		this.categoriesList.remove(category);
	}

	@Override
	public CategoryIterator iterator(CategoryType type) {
		return new CategoryIteratorImpl(type,this.categoriesList);
	}
	
	 private class CategoryIteratorImpl implements CategoryIterator {
		 

		 private CategoryType type;
         private List<Category> categories;
         private int position;
 
         public CategoryIteratorImpl(CategoryType categoryType,List<Category> categoriesList) {
             this.type = categoryType;
             this.categories = categoriesList;
         }
 
         @Override
         public boolean hasNext() {
             while (position < categories.size()) {
             	Category c = categories.get(position);
                 if (c.getCategoryType().equals(type)) {
                     return true;
                 } else
                     position++;
             }
             return false;
         }
 
         @Override
         public Category next() {
        	 Category c = categories.get(position);
        	 position++;
        	 return c;
         }
	 }

}
