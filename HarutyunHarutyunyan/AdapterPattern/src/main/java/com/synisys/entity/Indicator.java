package com.synisys.entity;

import java.math.BigDecimal;

public class Indicator {
	private BigDecimal actualValue;
	private BigDecimal targetValue;
	
	public BigDecimal getTargetValue() {
		return targetValue;
	}
	public void setTargetValue(BigDecimal targetValue) {
		this.targetValue = targetValue;
	}
	public BigDecimal getActualValue() {
		return actualValue;
	}
	public void setActualValue(BigDecimal actualValue) {
		this.actualValue = actualValue;
	}
}
