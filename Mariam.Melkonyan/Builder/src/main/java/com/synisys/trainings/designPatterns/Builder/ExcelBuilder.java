package com.synisys.trainings.designPatterns.Builder;

public class ExcelBuilder extends Builder{
	private String header;
	private String footer;
	private String content;
	private String textColor;

	public void buildHeader(String header){
		this.header = header;
	};
	
	public void buildFooter(String footer){
		this.footer = footer;
	};
	public void buildContent(String content){
		this.content = content;
	};
	
	public void addTextColor(String textColor){
		this.textColor = textColor;
	};
	
	String getExcelString(){
		return "header = " + header + " content = " + content + " footer = " + footer + " text color = " + textColor;
	} 

}
