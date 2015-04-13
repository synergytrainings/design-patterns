package com.synisys.strategy;

import java.math.BigDecimal;

import com.synisys.utility.Indicator;

public class IndicatorDisaggregationsComposition {
	Indicator indicator;

	public IndicatorDisaggregationsComposition() {
		indicator = new Indicator();
	}

	public Indicator getIndicator() {
		return indicator;
	}

	public BigDecimal calculateActual(CalculateStrategy strategy) {
		return strategy.calculateActual(indicator);
	}
}
