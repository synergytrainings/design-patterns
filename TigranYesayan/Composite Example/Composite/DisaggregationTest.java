package com.synisys.trainings.Composite;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DisaggregationTest {
	Disaggregation disaggregation1;
	Disaggregation disaggregation2;
	Disaggregation disaggregation3;
	DisaggregationComposite dComposite;
	
	@Before
	public void setValues(){
		disaggregation1 = new DisaggregationClass(1, 1, "Disaggregation1", new BigDecimal("100"));
		disaggregation2 = new DisaggregationClass(1, 2, "Disaggregation2", new BigDecimal("100"));
		disaggregation3 = new DisaggregationClass(1, 3, "Disaggregation2", new BigDecimal("100"));
		dComposite = new DisaggregationComposite();
		dComposite.addDisaggregation(disaggregation1);
		dComposite.addDisaggregation(disaggregation2);
		dComposite.addDisaggregation(disaggregation3);
		dComposite.removeDisaggregation(disaggregation3);
	}
	
	@Test
	public void checkDisaggregation(){
		Assert.assertEquals("Second level disaggregation baseline value is 100",
				(dComposite.getDisaggregations().get(1).getBaseline()), new BigDecimal(100));
	}

}
