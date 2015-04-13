package com.synisys.strategy;

import java.math.BigDecimal;

import com.synisys.utility.Indicator;

public interface CalculateStrategy {
	public BigDecimal calculateActual(Indicator ind);
}
