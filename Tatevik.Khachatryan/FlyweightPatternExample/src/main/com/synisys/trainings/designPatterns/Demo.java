package main.com.synisys.trainings.designPatterns;

import main.com.synisys.trainings.designPatterns.impl.ColorScheme;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Report report1 = ReportFactory.getReport("Report1", ColorScheme.BLUE);
		Report report2 = ReportFactory.getReport("Report2", ColorScheme.GREEN);
		Report report3 = ReportFactory.getReport("Report3", ColorScheme.YELLOW);
		Report report4 = ReportFactory.getReport("Report3", ColorScheme.GREEN);
		
		report1.draw(10, 10);
		report2.draw(10, 20);
		report3.draw(50, 60);
		report4.draw(-10, 0);
	}

}
