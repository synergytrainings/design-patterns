package com.synisys.trainings.Facade;

public class FacadeCoffeeMaker {

	public FacadeCoffeeMaker() {
	}

	public CoffeeCup makeCoffee() {
		CoffeeCup cup = new CoffeeCup();
		Coffee coffee = new Coffee();
		Water water = new Water();
		cup.addCoffee(coffee);
		cup.addWater(water);
		return cup;
	}
}
