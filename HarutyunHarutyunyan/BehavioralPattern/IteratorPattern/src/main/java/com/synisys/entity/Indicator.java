package com.synisys.entity;

import java.math.BigDecimal;

public class Indicator {
	private String indicatorName;
	private BigDecimal actualValue;
	
	public Indicator(String indicatorName, BigDecimal actualValue) {
		super();
		this.indicatorName = indicatorName;
		this.actualValue = actualValue;
	}
	public BigDecimal getActualValue() {
		return actualValue;
	}
	public void setActualValue(BigDecimal actualValue) {
		this.actualValue = actualValue;
	}
	public String getIndicatorName() {
		return indicatorName;
	}
	public void setIndicatorName(String indicatorName) {
		this.indicatorName = indicatorName;
	}
	
	@Override
	public String toString() {
		return this.indicatorName + "   " + actualValue;
	}
}
