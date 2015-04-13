package com.synisys.utility;

import java.util.ArrayList;
import java.util.List;

public class Indicator {
	private int indicatorId;
	private List<Disaggregation> disaggregations;

	public Indicator() {
		disaggregations = new ArrayList<Disaggregation>();
	}

	public int getIndicatorId() {
		return indicatorId;
	}

	public void setIndicatorId(int indicatorId) {
		this.indicatorId = indicatorId;
	}

	public List<Disaggregation> getDisaggregations() {
		return disaggregations;
	}

	public void setDisaggregations(List<Disaggregation> disaggregations) {
		this.disaggregations = disaggregations;
	}

	public void addDsaggregation(Disaggregation disaggregation) {
		this.disaggregations.add(disaggregation);
	}
}
