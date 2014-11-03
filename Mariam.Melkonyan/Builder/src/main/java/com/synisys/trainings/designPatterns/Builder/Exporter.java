package com.synisys.trainings.designPatterns.Builder;

public class Exporter {
	
	void export(Builder builder){
		builder.buildHeader("test");
		builder.buildContent("Builder Pattern");
		builder.buildFooter("test");
		builder.addTextColor("red");
		builder.addPaging(5);
	} 
}
