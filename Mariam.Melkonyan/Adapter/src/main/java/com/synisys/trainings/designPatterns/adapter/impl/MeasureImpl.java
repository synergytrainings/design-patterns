package com.synisys.trainings.designPatterns.adapter.impl;

import com.synisys.trainings.designPatterns.adapter.interfaces.Measure;

public class MeasureImpl implements Measure {
	private String id;
	private String name;
	private MeasureType type;
	
	public MeasureImpl(String id, String name, MeasureType type) {
		this.id = id;
		this.name = name;
		this.type = type;
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public MeasureType getType() {
		return this.type;
	}

}
