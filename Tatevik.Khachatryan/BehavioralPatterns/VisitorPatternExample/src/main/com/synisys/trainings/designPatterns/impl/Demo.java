package main.com.synisys.trainings.designPatterns.impl;

import main.com.synisys.trainings.designPatterns.Report;

public class Demo {
	 public static void main(String[] args) {
	      Report report = new Dasheboard();
	      // Print dasheboard
	      report.accept(new ReportPrintVisitor());

	      // Export dasheboard
	      report.accept(new ReportExportVisitor());
	   }
}
