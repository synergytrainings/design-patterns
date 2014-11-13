package com.synisys.adapterObject;

import java.math.BigDecimal;
import java.util.List;

import com.synisys.adaptee.IndicatorList;
import com.synisys.entity.Indicator;
import com.synisys.target.IndicatorListInfo;

//example of an object adapter
public class CumulativeIndicatorList implements IndicatorListInfo {
	private IndicatorList indicatorList;
	
	public CumulativeIndicatorList() {
		indicatorList = new IndicatorList();
	}
	
	public BigDecimal getActualValuesTotal() {
		
		return indicatorList.getIndicators().get(indicatorList.getIndicators().size() - 1).getActualValue();
	}

	public BigDecimal getTargetValuesTotal() {
		return indicatorList.getIndicators().get(indicatorList.getIndicators().size() - 1).getTargetValue();
	}

	public void setIndicatorList(List<Indicator> indicatorList) {
		this.indicatorList.setIndicators(indicatorList);
		
	}

}
