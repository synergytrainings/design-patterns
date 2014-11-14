package com.synisys.trainings.designPatterns.adapter.impl;

import com.synisys.trainings.designPatterns.adapter.interfaces.Category;
import com.synisys.trainings.designPatterns.adapter.interfaces.Measure;
import com.synisys.trainings.designPatterns.adapter.interfaces.Reporting;

public class ReportingImpl implements Reporting {
	private Category category = null;
	private Measure measure = null;
	public String loadData() {
		return "Report generated for" + category.getName() + "_" + measure.getName(); 
	}
	
	public void setMeasure(Measure measure) {
		this.measure = measure;		
	}
	
	protected void setCategory(Category category){
		this.category = category;
	}

}
