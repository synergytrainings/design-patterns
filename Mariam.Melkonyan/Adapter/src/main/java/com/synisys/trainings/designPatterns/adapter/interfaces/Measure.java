package com.synisys.trainings.designPatterns.adapter.interfaces;

import com.synisys.trainings.designPatterns.adapter.impl.MeasureType;

public interface Measure {
	public String getId();
	public String getName();
	public MeasureType getType();
}
