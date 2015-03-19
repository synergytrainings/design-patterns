package com.synisys.trainings.Iterator;


public class Category {
	
	public Category(String title, String description, CategoryType categoryType) {
		this.title = title;
		this.description = description;
		this.categoryType = categoryType;
	}

	private String title;
	private String description;
	private CategoryType categoryType;
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the categoryType
	 */
	public CategoryType getCategoryType() {
		return categoryType;
	}
	/**
	 * @param categoryType the categoryType to set
	 */
	public void setCategoryType(CategoryType categoryType) {
		this.categoryType = categoryType;
	}
	
	//TODO
	public void insert(){
		System.out.println("Category Title: " + this.title + " " + "Category description: " + this.description + " " + "Category Type: " + this.categoryType);
	}
}
