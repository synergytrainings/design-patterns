package com.synisys.entity;

public class Car {
	public Car(String carModel, String carYear) {
		this.carModel = carModel;
		this.carYear = carYear;
	}

	private String carModel;
	private String carYear;

	public String getModel() {
		return this.carModel;
	}

	public String getYear() {
		return this.carYear;
	}

	@Override
	public String toString() {
		return "Model " + this.getModel() + ", Year " + this.getYear();
	}

}
