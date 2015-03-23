package main.com.synisys.trainings.designPatterns.impl;

import main.com.synisys.trainings.designPatterns.Iterator;
import main.com.synisys.trainings.designPatterns.impl.Report.ReportType;

public class Demo {
	public static void main(String args[]) {
		//Initialize container
		ReportContainer container = new ReportContainer();
		container.addItemToReportList(new Report("Chart Report 1", ReportType.CHART));
		container.addItemToReportList(new Report("List Report 1", ReportType.LIST));
		container.addItemToReportList(new Report("Chart Report 2", ReportType.CHART));
		container.addItemToReportList(new Report("Chart Report 3", ReportType.CHART));
		container.addItemToReportList(new Report("Chart Report 4", ReportType.CHART));
		container.addItemToReportList(new Report("List Report 2", ReportType.LIST));
		container.addItemToReportList(new Report("List Report 3", ReportType.LIST));
		container.addItemToReportList(new Report("Chart Report 5", ReportType.CHART));
		container.addItemToReportList(new Report("List Report 4", ReportType.LIST));

		//Create Chart Iterator
		Iterator chartIterator = container.getIterator(ReportType.CHART);
		while (chartIterator.hasNext()) {
			System.out.println("Chart Report: "
					+ chartIterator.next().getReportName());
		}

		//Create List Iterator
		Iterator listIterator = container.getIterator(ReportType.LIST);
		while (listIterator.hasNext()) {
			System.out.println("List Report: "
					+ listIterator.next().getReportName());
		}
	}

}
