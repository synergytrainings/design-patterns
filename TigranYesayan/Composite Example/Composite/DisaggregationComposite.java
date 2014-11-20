package com.synisys.trainings.Composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DisaggregationComposite
		implements Disaggregation {

	private List<Disaggregation> disaggregations = new ArrayList<Disaggregation>();

	private Integer id;
	private Integer level;
	private String name;
	private BigDecimal baseline;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getBaseline() {
		return baseline;
	}

	public void setBaseline(BigDecimal baseline) {
		this.baseline = baseline;
	}

	/**
	 * @return the disaggregations
	 */
	public List<Disaggregation> getDisaggregations() {
		return disaggregations;
	}

	/**
	 * @param disaggregations
	 *            the disaggregations to set
	 */
	public void setDisaggregations(List<Disaggregation> disaggregations) {
		this.disaggregations = disaggregations;
	}

	public void addDisaggregation(Disaggregation disaggregation) {
		if (getDisaggregations() == null) setDisaggregations(new ArrayList<Disaggregation>());
		getDisaggregations().add(disaggregation);

	}

	public void removeDisaggregation(Disaggregation disaggregation) {
		if (getDisaggregations() != null) getDisaggregations().remove(disaggregation);
		else throw new IllegalStateException("Disaggregation list is null");
	}

}
