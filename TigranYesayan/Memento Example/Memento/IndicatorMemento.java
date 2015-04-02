package com.synisys.trainings.Memento;

public class IndicatorMemento {
	
	private Indicator indicator;
	
	public IndicatorMemento(Indicator indicator){
		this.indicator = indicator;
	}
	
	public Indicator getIndicator() {
		return indicator;
	}
}
