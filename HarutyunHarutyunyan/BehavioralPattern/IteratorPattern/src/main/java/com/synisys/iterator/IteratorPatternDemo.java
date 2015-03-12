package com.synisys.iterator;

import com.synisys.entity.Indicator;

public class IteratorPatternDemo {
	
	public static void main(String[] args) {
	      IndicatorList indicatorList = new IndicatorList();
	      
	      for(Iterator iter = indicatorList.getIterator(); iter.hasNext();){
	          Indicator indicator = (Indicator)iter.next();
	          System.out.println(indicator);
	       } 	
	      
	}
}
