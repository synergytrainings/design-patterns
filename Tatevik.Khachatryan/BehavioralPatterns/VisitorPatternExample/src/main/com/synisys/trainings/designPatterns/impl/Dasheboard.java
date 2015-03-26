package main.com.synisys.trainings.designPatterns.impl;

import java.util.ArrayList;
import java.util.List;

import main.com.synisys.trainings.designPatterns.Report;
import main.com.synisys.trainings.designPatterns.ReportVisitor;

public class Dasheboard implements Report{
	private List<Report> reports;
	
	public Dasheboard(){
		reports = new ArrayList<>();
		reports.add(new Chart());
		reports.add(new main.com.synisys.trainings.designPatterns.impl.List());
		reports.add(new Map());
	}
	
	@Override
	public void accept(ReportVisitor reportVisitor) {
		reportVisitor.visit(this);
		
		for (Report report: reports){
			report.accept(reportVisitor);
		}				
	}

}
