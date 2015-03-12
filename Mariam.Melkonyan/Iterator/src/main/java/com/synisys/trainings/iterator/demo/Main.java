package com.synisys.trainings.iterator.demo;

import java.util.ArrayList;
import java.util.List;

import com.synisys.trainings.iterator.impl.MeasureCollectionImpl;
import com.synisys.trainings.iterator.impl.MeasureImpl;
import com.synisys.trainings.iterator.impl.MeasureType;
import com.synisys.trainings.iterator.interfaces.Measure;
import com.synisys.trainings.iterator.interfaces.MeasureCollection;
import com.synisys.trainings.iterator.interfaces.MeasureIterator;

public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
        MeasureCollection measures = createMeasures();
        MeasureIterator numberMeasureIterator = measures.iterator(MeasureType.NUMBER);
        List<Measure> numberMeasures = new ArrayList<Measure>();
        while (numberMeasureIterator.hasNext()) {
            Measure measure = numberMeasureIterator.next();
            numberMeasures.add(measure);
        }
        MeasureIterator moneyMeasureIterator = measures.iterator(MeasureType.MONEY);
        List<Measure> moneyMeasures = new ArrayList<Measure>();
        while (moneyMeasureIterator.hasNext()) {
            Measure measure = moneyMeasureIterator.next();
            moneyMeasures.add(measure);
        }
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
