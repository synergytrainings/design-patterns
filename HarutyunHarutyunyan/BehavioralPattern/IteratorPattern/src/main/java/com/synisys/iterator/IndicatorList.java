package com.synisys.iterator;

import java.math.BigDecimal;

import com.synisys.entity.Indicator;

public class IndicatorList implements Container {

    private Indicator[] indicators = {new Indicator("Indicator 1", new BigDecimal(10)), new Indicator("Indicator 2", new BigDecimal(20))}; 
	
	@Override
	public Iterator getIterator() {
		return new IndicatorListIterate() ;
	}
	
	
	private class IndicatorListIterate implements Iterator{
		private int i;

		@Override
		public boolean hasNext() {
			return i < indicators.length ? true : false;
		}

		@Override
		public Object next() {
			 return this.hasNext() ? indicators[i++] : null;	
		}
	}
}


