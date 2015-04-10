package com.synisys.trainings.state.impl;

import com.synisys.trainings.state.interfaces.Chart;
import com.synisys.trainings.state.interfaces.ChartObserver;

public class ChartRenderer implements ChartObserver, Chart {
	private Chart chart;

	public ChartRenderer(ChartType chartType) {
		this.chart = createChart(chartType);
	}

	public void render(String data) {
		this.chart.render(data);
	}

	public void update(ChartType chartType) {
		this.chart = createChart(chartType);
	}

	private Chart createChart(ChartType chartType) {
		Chart chart;
		switch (chartType) {
		case BarChart: {
			chart = new BarChart();
			break;
		}
		case PieChart: {
			chart = new PieChart();
			break;
		}
		default:
			throw new IllegalArgumentException(
					"The specified chart type is illegal");

		}
		return chart;
	}

}
