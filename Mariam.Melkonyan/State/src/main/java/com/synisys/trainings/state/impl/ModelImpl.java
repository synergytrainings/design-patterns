package com.synisys.trainings.state.impl;

import java.util.ArrayList;
import java.util.List;

import com.synisys.trainings.state.interfaces.ChartObserver;
import com.synisys.trainings.state.interfaces.Model;

public class ModelImpl implements Model {
	private List<ChartObserver> observers = null;
	private ChartType chartType;

	public ModelImpl() {
		observers = new ArrayList<ChartObserver>();
	}

	public void attach(ChartObserver observer) {
		observers.add(observer);
	}

	public void detach(ChartObserver observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		for (ChartObserver observer : observers) {
			observer.update(this.chartType);
		}
	}

	public ChartType getChartType() {
		return this.chartType;
	}

	public void setChartType(ChartType chartType) {
		this.chartType = chartType;
		this.notifyObservers();
	}

}
