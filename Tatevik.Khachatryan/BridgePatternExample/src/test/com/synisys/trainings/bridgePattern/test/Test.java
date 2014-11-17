package test.com.synisys.trainings.bridgePattern.test;

import main.com.synisys.trainings.bridgePattern.*;
import main.com.synisys.trainings.bridgePattern.impl.*;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Chart pieChart = new ChartImpl(new PieChart());
		 Chart lineChart = new ChartImpl(new LineChart());
		 Chart barChart = new ChartImpl(new BarChart());

		 pieChart.draw();
		 lineChart.draw();
		 barChart.draw();
	}

}
