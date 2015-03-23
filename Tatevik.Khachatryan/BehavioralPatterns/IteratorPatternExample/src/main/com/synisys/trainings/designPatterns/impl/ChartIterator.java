package main.com.synisys.trainings.designPatterns.impl;

import java.util.List;

import main.com.synisys.trainings.designPatterns.Iterator;
import main.com.synisys.trainings.designPatterns.impl.Report.ReportType;

public class ChartIterator implements Iterator {

	public List<Report> list;
	private int position;

	public ChartIterator(List<Report> list) {
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		if (position < list.size()) {
			for (int i = position + 1; i < list.size(); i++) {
				if (ReportType.CHART.equals((list.get(i)).getReportType())) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public Report next() {
		Report item = null;
		for (; position < list.size(); position++) {
			if (ReportType.CHART.equals((list.get(position).getReportType()))) {
				item = list.get(position);
				position++;
				break;
			}
		}
		return item;
	}

}
