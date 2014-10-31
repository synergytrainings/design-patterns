package com.synisys.trainings.designPatterns.ColumnElement;

import com.synisys.trainings.designPatterns.ColumnElementInterfaces.ColumnElement;

public class ColumnMeasureElement implements ColumnElement {
	private String id;
	private String name;
	private boolean isCategoryElement = false;
	
	public ColumnMeasureElement(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public boolean isCategoryElement() {
		return this.isCategoryElement;
	}

}
