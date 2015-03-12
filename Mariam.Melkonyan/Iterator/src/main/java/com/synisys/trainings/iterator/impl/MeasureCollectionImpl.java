package com.synisys.trainings.iterator.impl;

import java.util.ArrayList;
import java.util.List;

import com.synisys.trainings.iterator.interfaces.Measure;
import com.synisys.trainings.iterator.interfaces.MeasureCollection;
import com.synisys.trainings.iterator.interfaces.MeasureIterator;

public class MeasureCollectionImpl implements MeasureCollection {
	private List<Measure> measureList;
	
	public MeasureCollectionImpl(){
		this.measureList = new ArrayList<Measure>();	
	}
	public void addMeasure(Measure measure) {
		this.measureList.add(measure);
	}

	public void removeMeasure(Measure measure) {
		this.measureList.remove(measure);
	}

	public MeasureIterator iterator(MeasureType type) {
		return new MeasureIteratorImpl(measureList, type);
	}

}
