package com.synisys.trainings.TemplateMethod;

public class Arabica
		extends Coffee {

	@Override
	public void addCoffee() {
		System.out.println("adding 1 spoon Arabica");
	}

	@Override
	public void addSugar() {
		System.out.println("adding half spoon sugar");
	}

	@Override
	public void addWater() {
		System.out.println("adding 1 cup water");
	}

}
