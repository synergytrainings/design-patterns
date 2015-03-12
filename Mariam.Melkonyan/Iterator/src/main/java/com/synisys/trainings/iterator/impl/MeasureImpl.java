package com.synisys.trainings.iterator.impl;

import com.synisys.trainings.iterator.interfaces.Measure;

public class MeasureImpl implements Measure {
	private String name;
	private MeasureType type;
	
	public MeasureImpl(String name, MeasureType type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return this.name;
	}

	public MeasureType getType() {
		return this.type;
	}

}
