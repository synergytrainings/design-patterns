package com.synisys.trainings.designPatterns.facade;

import java.util.List;

public class Mapbuilder {
	List<String> chartMeasures = null;
	List<String> scaleMeasures = null;
	
	public List<String> getChartMeasures() {
		return chartMeasures;
	}
	public void setChartMeasures(List<String> chartMeasures) {
		this.chartMeasures = chartMeasures;
	}
	public List<String> getScaleMeasures() {
		return scaleMeasures;
	}
	public void setScaleMeasures(List<String> scaleMeasures) {
		this.scaleMeasures = scaleMeasures;
	}
	
	public String draw(){
		String drawResult = "";
		if(scaleMeasures != null) {
			drawResult += "Scale Measures are " + scaleMeasures.toString();
		}
		if(chartMeasures != null){
			drawResult +=  " Chart Measures are " + chartMeasures.toString();
		}
		return drawResult;
	}
	
}
