package main.com.synisys.trainings.designPatterns.impl;

public class Chart extends ReportItem{
	
	protected Chart(String name) {
		super(name);
	}

	@Override
	public void draw(){
		System.out.println("Draw Chart " + name);
	}
}
