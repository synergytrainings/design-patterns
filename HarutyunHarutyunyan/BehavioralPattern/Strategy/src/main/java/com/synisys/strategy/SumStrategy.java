package com.synisys.strategy;

import java.math.BigDecimal;

import com.synisys.utility.Disaggregation;
import com.synisys.utility.Indicator;

public class SumStrategy implements CalculateStrategy {

	public BigDecimal calculateActual(Indicator ind) {
		BigDecimal sum = new BigDecimal(0.0);
		for (Disaggregation disaggregation : ind.getDisaggregations()) {
			sum = sum.add(disaggregation.getActualValue());
		}
		return sum;
	}
}
