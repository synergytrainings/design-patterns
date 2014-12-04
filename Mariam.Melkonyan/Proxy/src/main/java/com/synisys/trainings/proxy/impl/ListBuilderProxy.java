package com.synisys.trainings.proxy.impl;

import com.synisys.trainings.proxy.api.ListBuilder;

public class ListBuilderProxy implements ListBuilder{
	private ListBuilder listBuilder = null;
	
	public String draw() {
		if(listBuilder == null){
			createListBuilder();
		}
		return listBuilder.draw();
	}
	
	private void createListBuilder() {
		this.listBuilder = new ListBuilderImpl();
		
	}
	
}
