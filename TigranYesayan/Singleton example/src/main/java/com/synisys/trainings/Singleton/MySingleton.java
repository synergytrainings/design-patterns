package com.synisys.trainings.Singleton;

import java.util.Map;

public class MySingleton
		implements Cloneable {
	private static MySingleton instance = null;

	private MySingleton() {
	}
	
	private Map<String,Integer> formIds;

	public static MySingleton getInstance() {
		if (instance == null) {
			instance = new MySingleton();
		}
		return instance;
	}

	@Override
	public Object clone()
			throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	/**
	 * @return the formIds
	 */
	public Map<String,Integer> getFormIds() {
		return formIds;
	}

	/**
	 * @param formIds the formIds to set
	 */
	public void setFormIds(Map<String,Integer> formIds) {
		this.formIds = formIds;
	}
}
