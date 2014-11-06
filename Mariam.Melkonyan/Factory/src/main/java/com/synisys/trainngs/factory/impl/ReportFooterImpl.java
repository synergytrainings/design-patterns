package com.synisys.trainngs.factory.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.synisys.trainngs.factory.interfaces.ReportFooter;

public class ReportFooterImpl implements ReportFooter{
	public String getFooterString() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		return "Report generated on " + dateFormat.format(date);
	}
}
