package com.synisys.trainings.Decorator;

public class Mercedes
		extends Decorator {

	public Mercedes(Car c) {
		super(c);
	}

	@Override
	public String getName() {
		return this.car.getName();
	}

	public String getModel() {
		return "C200";
	}

}
