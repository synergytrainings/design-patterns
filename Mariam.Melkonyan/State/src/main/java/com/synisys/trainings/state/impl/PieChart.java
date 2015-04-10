package com.synisys.trainings.state.impl;

import com.synisys.trainings.state.interfaces.Chart;

public class PieChart implements Chart {

	public void render(String data) {
		processData(data);
		drawSectors();
	}

	private void drawSectors() {
		System.out.println("Sectors are drawn!");
	}

	private void processData(String data) {
		System.out.println("Data is processed for Pie Chart!");
	}

}
