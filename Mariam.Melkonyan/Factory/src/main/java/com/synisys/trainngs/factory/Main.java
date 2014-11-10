package com.synisys.trainngs.factory;

import com.synisys.trainngs.factory.impl.ReportFooterFactory;
import com.synisys.trainngs.factory.interfaces.ReportFooter;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReportFooterFactory reportFooterFactory = new ReportFooterFactory();
		ReportFooter appspecificReportFooter = reportFooterFactory.createReportFooter("appspecific");
		System.out.println(appspecificReportFooter.getFooterString());

		ReportFooter reportFooter = reportFooterFactory.createReportFooter("core");
		System.out.println(reportFooter.getFooterString());

	}

}
