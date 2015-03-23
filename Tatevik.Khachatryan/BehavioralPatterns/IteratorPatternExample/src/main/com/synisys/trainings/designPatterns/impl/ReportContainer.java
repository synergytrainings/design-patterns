package main.com.synisys.trainings.designPatterns.impl;

import java.util.ArrayList;
import java.util.List;

import main.com.synisys.trainings.designPatterns.Container;
import main.com.synisys.trainings.designPatterns.Iterator;
import main.com.synisys.trainings.designPatterns.impl.Report.ReportType;

public class ReportContainer implements Container{
	List<Report> reportList;
	public ReportContainer(){
		reportList = new ArrayList<>();
	}
	
	@Override
	public Iterator getIterator(ReportType type) {
		if (type == ReportType.CHART) {
			return new ChartIterator(reportList);
		} else if (type == ReportType.LIST) {
			return new ListIterator(reportList);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public List<Report> getReportList() {
		return reportList;
	}

	@Override
	public void addItemToReportList(Report item) { 
		reportList.add(item);
	}

	@Override
	public void removeItemFromReportList(Report item) {
		reportList.remove(item);
	}
	
}
