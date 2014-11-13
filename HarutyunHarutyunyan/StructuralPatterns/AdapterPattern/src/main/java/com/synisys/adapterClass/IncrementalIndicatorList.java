package com.synisys.adapterClass;

import java.math.BigDecimal;
import java.util.List;

import com.synisys.adaptee.IndicatorList;
import com.synisys.entity.Indicator;
import com.synisys.target.IndicatorListInfo;

//example of an class adapter
public class IncrementalIndicatorList extends IndicatorList implements IndicatorListInfo {
	
	
	public BigDecimal getActualValuesTotal() {
		return getIndicatorActualValuesTotal().multiply(new BigDecimal(10));
	}

	public BigDecimal getTargetValuesTotal() {
		return getIndicatorTargetValuesTotal().multiply(new BigDecimal(100));
	}

	public void setIndicatorList(List<Indicator> indicatorList) {
		setIndicators(indicatorList);
		
	}

}
