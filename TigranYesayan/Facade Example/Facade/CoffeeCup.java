package com.synisys.trainings.Facade;

public class CoffeeCup {
	Water water;
	Coffee coffee;

	public CoffeeCup() {
	}

	public void addCoffee(Coffee coffeeIn) {
		coffee = coffeeIn;
	}

	public void addWater(Water waterIn) {
		water = waterIn;
	}

}
