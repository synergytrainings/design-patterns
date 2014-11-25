package com.synisys.trainings.designPatterns.decorator.impl;

import com.synisys.trainings.designPatterns.decorator.api.Category;
import com.synisys.trainings.designPatterns.decorator.api.Format;

public class CategoryDecorator implements Category {
	private Category category;
	private Format format;
	
	public CategoryDecorator(Category category) {
		this.category = category;
	}
	public String getId() {
		return this.category.getId();
	}

	public String getName() {
		return this.category.getName();
	}
	
	public void setFormat(Format format){
		this.format = format;
	}
	
	public String toString(){
		String result = "";
		if(this.format.isBold()){
			result += "Bold ";
		}
		if(this.format.isItalic()){
			result += "Italic ";
		}
		result += "Category";
		return result;
	} 

}
