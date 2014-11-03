package com.synisys.trainings.designPatterns.Builder;

public class CSVBuilder extends Builder {
	private String header;
	private String footer;
	private String content;

	public void buildHeader(String header){
		this.header = header;
	};
	
	public void buildFooter(String footer){
		this.footer = footer;
	};
	public void buildContent(String content){
		this.content = content;
	};
	
	String getCSVString(){
		return "header = " + header + " content = " + content + " footer = " + footer;
	} 
}