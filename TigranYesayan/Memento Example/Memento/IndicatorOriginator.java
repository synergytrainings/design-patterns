package com.synisys.trainings.Memento;

public class IndicatorOriginator {

	private Indicator indicator;

	public void setIndicator(Indicator indicator) {
		this.indicator = indicator;
	}

	public Indicator getIndicator() {
		return indicator;
	}
	
	public IndicatorMemento createMemento() {
		return new IndicatorMemento(indicator);
	}

	public void setMemento(IndicatorMemento indicatorMemento) {
		indicator = indicatorMemento.getIndicator();
	}
}
