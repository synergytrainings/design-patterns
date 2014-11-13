package com.synisys.trainings.designPatterns.singleton.impl;

import java.util.ArrayList;

import com.synisys.trainings.designPatterns.singleton.interfaces.Category;
import com.synisys.trainings.designPatterns.singleton.interfaces.Measure;

public enum KbContainer {
    INSTANCE;
    private ArrayList<Measure> measures = null;
    private ArrayList<Category> categories = null;

    public static KbContainer getInstance() {
    	return INSTANCE;
	} 
    
    public void addMeasure(Measure measure) {
		if(measures == null){
			measures = new ArrayList<Measure>();
		}
		measures.add(measure);
	}
    
    public void addCategory(Category category){
    	if(categories == null){
    		categories =  new ArrayList<Category>();
    	}
    	categories.add(category);
    }
    
    public ArrayList<Measure> getMeasures() {
		return measures;
	}
    
    public ArrayList<Category> getCategories() {
		return categories;
	}
}
