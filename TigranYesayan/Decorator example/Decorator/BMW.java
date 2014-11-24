package com.synisys.trainings.Decorator;

public class BMW
		extends Decorator {

	public BMW(Car c) {
		super(c);
	}

	@Override
	public String getName() {
		return this.car.getName();
	}

	public String getEngineSize() {
		return "5L";
	}

}
