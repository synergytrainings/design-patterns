package com.synisys.trainings.TemplateMethod;

public abstract class Coffee {

	public final void makeCoffee() {
		addCoffee();
		addWater();
		addSugar();
		mix();
		System.out.println("Coffee is ready.");
	}

	private void mix() {
		System.out.println("Coffee is mixing");
	}

	public abstract void addCoffee();

	public abstract void addSugar();

	public abstract void addWater();
}
