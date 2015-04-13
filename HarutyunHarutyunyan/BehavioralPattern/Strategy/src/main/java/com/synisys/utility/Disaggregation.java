package com.synisys.utility;

import java.math.BigDecimal;

public class Disaggregation {
	private Integer dsaggregationId;
	private BigDecimal actualValue;

	public Disaggregation(Integer dsaggregationId, BigDecimal actualValue) {
		super();
		this.dsaggregationId = dsaggregationId;
		this.actualValue = actualValue;
	}

	public Integer getDsaggregationId() {
		return dsaggregationId;
	}

	public void setDsaggregationId(Integer dsaggregationId) {
		this.dsaggregationId = dsaggregationId;
	}

	public BigDecimal getActualValue() {
		return actualValue;
	}

	public void setActualValue(BigDecimal actualValue) {
		this.actualValue = actualValue;
	}
}
