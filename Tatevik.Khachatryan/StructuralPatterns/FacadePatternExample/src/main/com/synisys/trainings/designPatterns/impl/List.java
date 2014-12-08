package main.com.synisys.trainings.designPatterns.impl;

public class List extends ReportItem{
	
	protected List(String name) {
		super(name);
	}

	@Override
	public void draw(){
		System.out.println("Draw List " + name);
	}
}
