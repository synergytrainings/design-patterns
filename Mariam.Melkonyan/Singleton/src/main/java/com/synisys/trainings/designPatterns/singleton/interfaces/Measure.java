package com.synisys.trainings.designPatterns.singleton.interfaces;

import com.synisys.trainings.designPatterns.singleton.impl.MeasureType;

public interface Measure {
	public String getId();
	public String getName();
	public MeasureType getType();
}
