package main.com.synisys.trainings.designPatterns.impl;

import main.com.synisys.trainings.designPatterns.Report;
import main.com.synisys.trainings.designPatterns.ReportVisitor;

public class List implements Report{

	@Override
	public void accept(ReportVisitor reportVisitor) {
		reportVisitor.visit(this);
	}

}
