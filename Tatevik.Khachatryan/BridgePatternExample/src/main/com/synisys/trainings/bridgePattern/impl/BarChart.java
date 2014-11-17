package main.com.synisys.trainings.bridgePattern.impl;

import main.com.synisys.trainings.bridgePattern.ChartType;
import main.com.synisys.trainings.bridgePattern.DrawAPI;

public class BarChart implements DrawAPI {
	public static final ChartType CHART_TYPE = ChartType.BAR;
	
	@Override
	public void drawChart() {
		System.out.println("Drawing Chart... [type: bar]");
	}

}
