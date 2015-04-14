package com.synisys.trainings.Strategy;

import java.math.BigDecimal;
import java.util.List;

public class Row {
	private Integer level;
	private BigDecimal value;
	private String name;

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Row> getChildRows() {
		return childRows;
	}

	public void setChildRows(List<Row> childRows) {
		this.childRows = childRows;
	}

	private List<Row> childRows;
}
