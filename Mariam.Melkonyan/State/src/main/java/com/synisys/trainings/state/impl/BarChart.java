package com.synisys.trainings.state.impl;

import com.synisys.trainings.state.interfaces.Chart;

public class BarChart implements Chart {

	public void render(String data) {
		processData(data);
		drawBars();
	}

	private void drawBars() {
		System.out.println("Bars are drawn!");
	}

	private void processData(String data) {
		System.out.println("Data is processed for Bar Chart!");
	}

}
