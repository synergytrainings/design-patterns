package main.com.synisys.trainings.designPatterns.impl;

public class Map extends ReportItem {	
	protected Map(String name) {
		super(name);
	}

	@Override
	public void draw() {
		System.out.println("Draw Map " + name);
	}
}
