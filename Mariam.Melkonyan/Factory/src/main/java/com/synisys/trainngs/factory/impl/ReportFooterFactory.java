package com.synisys.trainngs.factory.impl;

import com.synisys.trainngs.factory.interfaces.ReportFooter;

public class ReportFooterFactory {
	public ReportFooter createReportFooter(String type){
		if(type.equals("appspecific")){
			return new AppspecificReportFooterImpl();
		}
		else if(type.equals("core")){
			return new ReportFooterImpl();
		}
		else{
			throw new IllegalArgumentException();
		}
	} 
}
