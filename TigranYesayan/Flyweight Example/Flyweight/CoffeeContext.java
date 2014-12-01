package com.synisys.trainings.Flyweight;

class CoffeeContext {
	private final int tableNumber;

	public CoffeeContext(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	public int getTable() {
		return this.tableNumber;
	}
}
