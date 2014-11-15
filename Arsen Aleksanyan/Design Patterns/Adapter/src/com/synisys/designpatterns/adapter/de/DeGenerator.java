package com.synisys.designpatterns.adapter.de;

public class DeGenerator {
	private DeApi deApi;
	
	public DeGenerator(DeApi deApi){
		this.deApi = deApi;
	}
	
	public void generate(){
		for(DeCategory deCategory : deApi.getCategories()){
			//TODO: Use category properties to generate classes for every category
		}
	}
}
