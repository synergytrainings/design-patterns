package main.com.synisys.trainings.designPatterns;

public interface Facade {
	public void drawChart(String chartName);
	
	public void drawList(String listName);
	
	public void drawMap(String mapName);
	
	public void drawReport(String reportName, String[] chartNames, String[] listNames);
}
