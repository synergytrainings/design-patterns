package main.com.synisys.trainings.bridgePattern.impl;

import main.com.synisys.trainings.bridgePattern.Chart;
import main.com.synisys.trainings.bridgePattern.DrawAPI;

public class ChartImpl extends Chart{

	public ChartImpl(DrawAPI drawAPI){
		super(drawAPI);
	}
	
	@Override
	public void draw() {
		drawAPI.drawChart();	
	}	
}
