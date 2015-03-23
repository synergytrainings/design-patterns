package main.com.synisys.trainings.designPatterns;
import java.util.List;

import main.com.synisys.trainings.designPatterns.impl.Report;
import main.com.synisys.trainings.designPatterns.impl.Report.ReportType;

public interface Container {
	public Iterator getIterator(ReportType type);
	
	public List<Report> getReportList();
	public void addItemToReportList(Report item);
	public void removeItemFromReportList(Report item);
}
