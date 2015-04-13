package com.synisys.strategy;

import java.math.BigDecimal;

import com.synisys.utility.Disaggregation;

public class Demo {
	public static void main(String[] args) {
		IndicatorDisaggregationsComposition indDisComp = new IndicatorDisaggregationsComposition();

		Disaggregation dis1 = new Disaggregation(1, new BigDecimal(600));
		Disaggregation dis2 = new Disaggregation(2, new BigDecimal(200));
		Disaggregation dis3 = new Disaggregation(3, new BigDecimal(300));

		indDisComp.getIndicator().addDsaggregation(dis1);
		indDisComp.getIndicator().addDsaggregation(dis2);
		indDisComp.getIndicator().addDsaggregation(dis3);

		System.out.println(indDisComp.calculateActual(new SumStrategy()));

		System.out.println(indDisComp.calculateActual(new MaxStrategy()));
	}
}
