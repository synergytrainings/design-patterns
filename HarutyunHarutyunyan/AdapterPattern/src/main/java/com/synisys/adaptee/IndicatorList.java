package com.synisys.adaptee;

import java.math.BigDecimal;
import java.util.List;

import com.synisys.entity.Indicator;

public class IndicatorList {
	private List<Indicator> indicators;

	 public List<Indicator> getIndicators() {
		return indicators;
	}

	public void setIndicators(List<Indicator> indicators) {
		this.indicators = indicators;
	}

	public BigDecimal getIndicatorActualValuesTotal(){
		 BigDecimal sum = new BigDecimal(0);
		 for(Indicator indicator : indicators){
			 sum = sum.add(indicator.getActualValue());
		 }
		 return sum;
	 }
	 
	 public BigDecimal getIndicatorTargetValuesTotal(){
		 BigDecimal sum = new BigDecimal(0);
		 for(Indicator indicator : indicators){
			 sum = sum.add(indicator.getTargetValue());
		 }
		 return sum;
	 }
}
