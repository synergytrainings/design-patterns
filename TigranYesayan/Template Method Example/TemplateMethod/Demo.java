package com.synisys.trainings.TemplateMethod;

public class Demo {
	public static void main(String[] args) {
		Coffee coffee = new Arabica();
		coffee.makeCoffee();
		
		coffee = new Americano();
		coffee.makeCoffee();
	}
}
