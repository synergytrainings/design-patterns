package com.synisys.trainings.designPatterns.ColumnElement;

import com.synisys.trainings.designPatterns.ColumnElementInterfaces.ColumnElement;

public class ColumnCategoryElement implements ColumnElement {
	private String id;
	private String name;
	private boolean isCategoryElement = true;
	
	public String getId() {
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public boolean isCategoryElement() {
		return isCategoryElement;
	}

}
