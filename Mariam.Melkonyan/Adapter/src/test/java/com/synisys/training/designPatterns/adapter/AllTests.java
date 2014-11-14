package com.synisys.training.designPatterns.adapter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.synisys.trainings.designPatterns.adapter.impl.Adapter;
import com.synisys.trainings.designPatterns.adapter.impl.MeasureImpl;
import com.synisys.trainings.designPatterns.adapter.impl.MeasureType;
import com.synisys.trainings.designPatterns.adapter.interfaces.Measure;

public class AllTests {
	@Test
	public void test() {
		Measure measure = new MeasureImpl("A1_disbursement", "Disbursement", MeasureType.MONEY);
		Adapter adapter = new Adapter();
		adapter.setMeasure(measure);
		assertEquals(adapter.drawScaling(), "Scaling is applied!");
		
	}

}
