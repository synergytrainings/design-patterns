package com.synisys.trainings.Facade;

public class FacadeTest {
	public static void main(String[] args) {
		FacadeCoffeeMaker cuppaMaker = new FacadeCoffeeMaker();
		CoffeeCup teaCup = cuppaMaker.makeCoffee();
	}
}
