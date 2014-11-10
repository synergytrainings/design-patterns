package com.synisys.trainings.prototype;

import com.synisys.trainings.prototype.impl.ReportImpl;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReportImpl originalReport = new ReportImpl();
		originalReport.setHeader("header");
		originalReport.addRow("Sector");
		originalReport.addColumn("Commitment");
		
		System.out.println(originalReport.toString());
		
		//clone the report to do changes without corrupting original object
		ReportImpl cloneReport = originalReport.clone();
		cloneReport.removeRow("Sector");
		cloneReport.addRow("Project");
		
		//save changes to original report 
		cloneReport.copyTo(originalReport);
		
		System.out.println(originalReport.toString());

	}

}
