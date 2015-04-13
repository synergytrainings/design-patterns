package com.synisys.strategy;

import java.math.BigDecimal;

import com.synisys.utility.Disaggregation;
import com.synisys.utility.Indicator;

public class MaxStrategy implements CalculateStrategy {

	public BigDecimal calculateActual(Indicator ind) {
		BigDecimal max = new BigDecimal(0.0);
		for (Disaggregation disaggregation : ind.getDisaggregations()) {
			max = max.compareTo(disaggregation.getActualValue()) > 0 ? max
					: disaggregation.getActualValue();
		}
		return max;

	}

}
