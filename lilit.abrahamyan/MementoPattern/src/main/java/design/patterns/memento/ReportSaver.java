package design.patterns.memento;

import java.util.ArrayList;
import java.util.List;

public class ReportSaver {
	
	private List<Report.ReportMemento> savedReports = new ArrayList<>();
	
	public void saveReport(Report report){
		savedReports.add(report.save());
	}
	
	public void restoreReport(Report report) {
		if (savedReports.size() > 0) {
			report.restore(savedReports.get(savedReports.size()-1));
		}
	}
}