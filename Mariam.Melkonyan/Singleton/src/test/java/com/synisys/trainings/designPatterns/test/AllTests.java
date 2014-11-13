package com.synisys.trainings.designPatterns.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.synisys.trainings.designPatterns.singleton.impl.CategoryImpl;
import com.synisys.trainings.designPatterns.singleton.impl.KbContainer;
import com.synisys.trainings.designPatterns.singleton.impl.MeasureImpl;
import com.synisys.trainings.designPatterns.singleton.impl.MeasureType;
import com.synisys.trainings.designPatterns.singleton.interfaces.Category;
import com.synisys.trainings.designPatterns.singleton.interfaces.Measure;

public class AllTests {
	@Test
	public void test() {
		Measure measure = new MeasureImpl("A1_Commitment", "Commitment", MeasureType.MONEY);
		Category category = new CategoryImpl("A1_Sector", "Sector");
		KbContainer kbContainerInstance1 = KbContainer.getInstance();
		kbContainerInstance1.addCategory(category);
		kbContainerInstance1.addMeasure(measure);
		KbContainer kbContainerInstance2 = KbContainer.getInstance();
		assertEquals("Sector", kbContainerInstance2.getCategories().get(0).getName());
		assertEquals(measure, kbContainerInstance2.getMeasures().get(0));

	}

}
