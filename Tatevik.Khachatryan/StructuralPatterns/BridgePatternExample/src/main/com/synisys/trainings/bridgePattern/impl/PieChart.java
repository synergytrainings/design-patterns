package main.com.synisys.trainings.bridgePattern.impl;

import main.com.synisys.trainings.bridgePattern.ChartType;
import main.com.synisys.trainings.bridgePattern.DrawAPI;

public class PieChart implements DrawAPI {
	public static final ChartType CHART_TYPE = ChartType.PIE;
	
	@Override
	public void drawChart() {
		System.out.println("Drawing Chart... [type: pie]");
	}
}
