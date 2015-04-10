package com.synisys.trainings.state.demo;

import com.synisys.trainings.state.impl.ChartRenderer;
import com.synisys.trainings.state.impl.ChartType;
import com.synisys.trainings.state.impl.ModelImpl;

public class Main {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		ChartRenderer chartRenderer = new ChartRenderer(ChartType.BarChart);

		ModelImpl model = new ModelImpl();
		model.attach(chartRenderer);

		chartRenderer.render("Chart Data");

		model.setChartType(ChartType.PieChart);
		chartRenderer.render("Chart Data");

	}

}
