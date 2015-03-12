package com.synisys.training.iterator;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.synisys.trainings.iterator.impl.MeasureCollectionImpl;
import com.synisys.trainings.iterator.impl.MeasureImpl;
import com.synisys.trainings.iterator.impl.MeasureType;
import com.synisys.trainings.iterator.interfaces.Measure;
import com.synisys.trainings.iterator.interfaces.MeasureCollection;
import com.synisys.trainings.iterator.interfaces.MeasureIterator;


public class AllTests {
	@Test
	public void test() {
        MeasureCollection measures = createMeasures();
        MeasureIterator numberMeasureIterator = measures.iterator(MeasureType.NUMBER);
        List<Measure> numberMeasures = new ArrayList<Measure>();
        while (numberMeasureIterator.hasNext()) {
            Measure measure = numberMeasureIterator.next();
            numberMeasures.add(measure);
        }
        assertEquals(3, numberMeasures.size());
	}
	
	private static MeasureCollection createMeasures() {
		MeasureCollection measures = new MeasureCollectionImpl();
		measures.addMeasure(new MeasureImpl("# of projects", MeasureType.NUMBER));
		measures.addMeasure(new MeasureImpl("Commitment", MeasureType.MONEY));
		measures.addMeasure(new MeasureImpl("Disbursement", MeasureType.MONEY));
		measures.addMeasure(new MeasureImpl("Title", MeasureType.TEXT));
		measures.addMeasure(new MeasureImpl("# of agreements", MeasureType.NUMBER));
		measures.addMeasure(new MeasureImpl("# of contacts", MeasureType.NUMBER));
		return measures;
	}


}
