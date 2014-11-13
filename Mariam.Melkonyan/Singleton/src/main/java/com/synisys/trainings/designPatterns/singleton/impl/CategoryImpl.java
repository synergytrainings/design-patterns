package com.synisys.trainings.designPatterns.singleton.impl;

import com.synisys.trainings.designPatterns.singleton.interfaces.Category;

public class CategoryImpl implements Category {

	private String id;
	private String name;
	
	public CategoryImpl(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

}
