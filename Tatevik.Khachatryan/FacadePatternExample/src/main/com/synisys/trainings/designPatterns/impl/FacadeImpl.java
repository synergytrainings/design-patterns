package main.com.synisys.trainings.designPatterns.impl;

import java.util.ArrayList;
import java.util.List;

import main.com.synisys.trainings.designPatterns.Facade;

public class FacadeImpl implements Facade{
	@Override	
	public void drawChart(String chartName){
		Chart chart = new Chart(chartName);
		chart.draw();
	}
	
	@Override
	public void drawList(String listName){
		main.com.synisys.trainings.designPatterns.impl.List list = new main.com.synisys.trainings.designPatterns.impl.List(listName);
		list.draw();
	}
	
	@Override
	public void drawMap(String mapName) {
		Map map = new Map(mapName);
		map.draw();
	}
	
	@Override
	public void drawReport(String reportName, String[] chartNames, String[] listNames) {
		List<ReportItem> reportItems = new ArrayList<>();
		for (String chartName : chartNames){
			reportItems.add(new Chart(chartName));
		}
		
		for (String listName : listNames){
			reportItems.add(new main.com.synisys.trainings.designPatterns.impl.List(listName));
		}				
		
		Report report = new Report(reportName, reportItems);
		report.draw();
	}	
}
