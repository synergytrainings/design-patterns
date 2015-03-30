package com.synisys.mediator;

import java.math.BigDecimal;

public class Indicator {
	Mediator mediator;
	Integer soId;
	Integer indicatorId;

	public Indicator(Mediator mediator, Integer soId, Integer indicatorId) {
		super();
		this.mediator = mediator;
		this.soId = soId;
		this.indicatorId = indicatorId;
	}
	public Integer getSoId() {
		return soId;
	}
	public void setSoId(Integer soId) {
			this.soId = soId;
	}
	
	public void setSOs(Integer soId){
		mediator.setSO(soId);
	}
	public Integer getIndicatorId() {
		return indicatorId;
	}
	public void setIndicatorId(Integer indicatorId) {
		this.indicatorId = indicatorId;
	}
}
