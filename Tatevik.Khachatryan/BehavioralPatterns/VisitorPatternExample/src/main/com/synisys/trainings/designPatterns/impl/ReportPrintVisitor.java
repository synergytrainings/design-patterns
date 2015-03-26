package main.com.synisys.trainings.designPatterns.impl;

import main.com.synisys.trainings.designPatterns.ReportVisitor;

public class ReportPrintVisitor implements ReportVisitor {

	@Override
	public void visit(Dasheboard dasheboard) {
		 System.out.println("Printing Dasheboard data...");
	}

	@Override
	public void visit(Chart chart) {
		System.out.println("Printing Chart data...");
	}

	@Override
	public void visit(Map map) {
		System.out.println("Printing Map data...");
	}

	@Override
	public void visit(List list) {
		System.out.println("Printing List data...");
	}

}
