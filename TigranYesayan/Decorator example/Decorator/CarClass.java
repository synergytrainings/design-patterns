package com.synisys.trainings.Decorator;

public class CarClass
		implements Car {

	private String name;

	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
