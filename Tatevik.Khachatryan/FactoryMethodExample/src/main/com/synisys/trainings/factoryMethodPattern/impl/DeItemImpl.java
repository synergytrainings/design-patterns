package main.com.synisys.trainings.factoryMethodPattern.impl;

import main.com.synisys.trainings.factoryMethodPattern.DeItem;

public abstract class DeItemImpl implements DeItem{	
	private Integer deItemId;
	private String name;
	
	protected DeItemImpl(Integer deItemId, String name){
		this.deItemId = deItemId;
		this.name = name;
	}
	
	protected Integer getId(){
		return this.deItemId;
	}
	
	protected String getName(){
		return this.name;
	}
}
