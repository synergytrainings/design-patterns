package com.synisys.adapterTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import com.synisys.adapterClass.IncrementalIndicatorList;
import com.synisys.adapterObject.CumulativeIndicatorList;
import com.synisys.entity.Indicator;
import com.synisys.target.IndicatorListInfo;



public class AdapterPatternTest {
	@Test
	public void testGetInstance() throws Exception{
		List<Indicator> list = new ArrayList<Indicator>();
		for(int i = 0; i <= 10; ++i){
			Indicator ind = new Indicator();
			ind.setActualValue(new BigDecimal(i));
			ind.setTargetValue(new BigDecimal(i * 2));
			list.add(ind);
		}
		
		IndicatorListInfo incrementalIndicatorList = new IncrementalIndicatorList();
		incrementalIndicatorList.setIndicatorList(list);
		
		IndicatorListInfo cumulativeIndicatorList = new CumulativeIndicatorList();
		cumulativeIndicatorList.setIndicatorList(list);
		
		
		Assert.assertTrue("Incremental Indicators Actual Total Test", incrementalIndicatorList.getActualValuesTotal().equals(new BigDecimal(550)));
		Assert.assertTrue("Incremental Indicators Target Total Test", incrementalIndicatorList.getTargetValuesTotal().equals(new BigDecimal(11000)));
		Assert.assertTrue("Cumulative Indicators Actual Total Test", cumulativeIndicatorList.getActualValuesTotal().equals(new BigDecimal(10)));
		Assert.assertTrue("Cumulative Indicators Target Total Test", cumulativeIndicatorList.getTargetValuesTotal().equals(new BigDecimal(20)));
	}

}
