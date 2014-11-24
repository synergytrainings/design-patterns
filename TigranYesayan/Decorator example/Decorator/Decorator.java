package com.synisys.trainings.Decorator;

public class Decorator
		implements Car {

	protected Car car;

	public Decorator(Car c) {
		this.car = c;
	}

	@Override
	public String getName() {
		return this.car.getName();
	}

}
