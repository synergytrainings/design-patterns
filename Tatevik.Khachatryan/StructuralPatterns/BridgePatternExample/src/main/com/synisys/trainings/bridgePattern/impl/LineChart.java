package main.com.synisys.trainings.bridgePattern.impl;

import main.com.synisys.trainings.bridgePattern.ChartType;
import main.com.synisys.trainings.bridgePattern.DrawAPI;

public class LineChart implements DrawAPI {
	public static final ChartType CHART_TYPE = ChartType.LINE;

	@Override
	public void drawChart() {
		System.out.println("Drawing Chart... [type: line]");

	}

}
