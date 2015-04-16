package com.synisys.trainings.TemplateMethod;

public class Americano
		extends Coffee {

	@Override
	public void addCoffee() {
		System.out.println("adding 1 spoon coffee");
	}

	@Override
	public void addSugar() {
		System.out.println("adding 1 spoon sugar");
	}

	@Override
	public void addWater() {
		System.out.println("adding half cup water");
	}

}
