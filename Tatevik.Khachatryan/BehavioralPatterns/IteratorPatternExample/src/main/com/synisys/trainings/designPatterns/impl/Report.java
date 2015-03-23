package main.com.synisys.trainings.designPatterns.impl;

public class Report {
	public enum ReportType{LIST, CHART}
	
	private final String reportName;
	private final ReportType reportType;
	
	public Report(String reportName, ReportType reportType){
		this.reportName = reportName;
		this.reportType = reportType;		
	}
	
	public String getReportName(){
		return this.reportName;
	}
	
	public ReportType getReportType(){
		return this.reportType;
	}
}
