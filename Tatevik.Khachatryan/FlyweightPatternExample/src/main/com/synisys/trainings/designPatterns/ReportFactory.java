package main.com.synisys.trainings.designPatterns;

import java.util.HashMap;

import main.com.synisys.trainings.designPatterns.impl.ColorScheme;
import main.com.synisys.trainings.designPatterns.impl.ReportImpl;

public class ReportFactory {	
	private static final HashMap<String, Report> reports = new HashMap<>();

	public static Report getReport(String label, ColorScheme scheme) {
		Report report = reports.get(label);

		if (report == null) {			
			report = new ReportImpl(label, scheme);
		}
		
		return report;
	}

}
