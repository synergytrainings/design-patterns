package com.synisys.trainings.Composite;

import java.math.BigDecimal;

public class DisaggregationClass
		implements Disaggregation {

	public DisaggregationClass(Integer id, Integer level, String name, BigDecimal baseline) {
		this.id = id;
		this.level = level;
		this.name = name;
		this.baseline = baseline;
	}

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

}
