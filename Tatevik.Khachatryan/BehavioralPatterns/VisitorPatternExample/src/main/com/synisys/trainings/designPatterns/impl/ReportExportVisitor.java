package main.com.synisys.trainings.designPatterns.impl;

import main.com.synisys.trainings.designPatterns.ReportVisitor;

public class ReportExportVisitor implements ReportVisitor {

	@Override
	public void visit(Dasheboard dasheboard) {
		 System.out.println("Exporting Dasheboard data...");
	}

	@Override
	public void visit(Chart chart) {
		System.out.println("Exporting Chart data...");
	}

	@Override
	public void visit(Map map) {
		System.out.println("Exporting Map data...");
	}

	@Override
	public void visit(List list) {
		System.out.println("Exporting List data...");
	}


}
