package main.com.synisys.trainings.designPatterns.impl;

import main.com.synisys.trainings.designPatterns.Drawable;

public abstract class ReportItem implements Drawable {
	protected String name;
	
	protected ReportItem(String name){
		this.name = name;
	}
	
	@Override
	public abstract void draw();
}
