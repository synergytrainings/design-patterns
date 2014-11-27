package main.com.synisys.trainings.designPatterns.impl;
import java.util.List;

import main.com.synisys.trainings.designPatterns.Drawable;

public class Report implements Drawable{
	private String name;
	private List<ReportItem> reportItems;
	
	public Report(String name, List<ReportItem> reportItems2){		
		this.name = name;
		this.reportItems = reportItems2;
	}
	
	@Override
	public void draw(){
		System.out.println("Draw Report " + name);
		for (ReportItem reportItem : reportItems){
			reportItem.draw();
		}
	}
}
