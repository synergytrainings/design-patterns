package com.synisys.trainings.designPatterns.Builder;

public class PdfBuilder extends Builder {
	private String header;
	private String footer;
	private String content;
	private String textColor;
	private int pageCount;

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
	
	public void addPaging(int pageCount){
		this.pageCount = pageCount;
	};

	
	String getPdfString(){
		return "header = " + header + " content = " + content + " footer = " + footer + " text color = " + textColor + " page count = " + pageCount;
	} 
}
