package com.synisys.trainings.iterator.impl;

import java.util.List;

import com.synisys.trainings.iterator.interfaces.Measure;
import com.synisys.trainings.iterator.interfaces.MeasureIterator;

public class MeasureIteratorImpl implements MeasureIterator {
	private List<Measure> measureList;
	private MeasureType type;
	private int currentIndex;
	
	public MeasureIteratorImpl(List<Measure> measureList, MeasureType type) {
		this.measureList = measureList;
		this.type = type;
		this.currentIndex = 0;
	}

	public Measure next() {
		while (currentIndex < measureList.size()) {
        	Measure measure = measureList.get(currentIndex);
        	currentIndex ++;
            if (measure.getType().equals(type)) {
                return measure;
            }
        }
        return null;
	}

	public boolean hasNext() {
        while (currentIndex < measureList.size()) {
        	Measure measure = measureList.get(currentIndex);
            if (measure.getType().equals(type)) {
                return true;
            } else
                currentIndex++;
        }
        return false;
	}

}
