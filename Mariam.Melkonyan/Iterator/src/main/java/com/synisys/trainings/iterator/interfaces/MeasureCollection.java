package com.synisys.trainings.iterator.interfaces;

import com.synisys.trainings.iterator.impl.MeasureType;

public interface MeasureCollection {
	public void addMeasure(Measure measure);
    
    public void removeMeasure(Measure measure);
     
    public MeasureIterator iterator(MeasureType type);
}
