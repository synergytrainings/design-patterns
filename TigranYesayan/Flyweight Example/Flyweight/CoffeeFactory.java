package com.synisys.trainings.Flyweight;

import java.util.HashMap;

class CoffeeFactory {

	private HashMap<String, Coffee> flavors = new HashMap<String, Coffee>();

	public Coffee getCoffeeFlavor(String flavorName) {
		Coffee flavor = flavors.get(flavorName);
		if (flavor == null) {
			flavor = new CoffeeImpl(flavorName);
			flavors.put(flavorName, flavor);
		}
		return flavor;
	}

	public int getTotalCoffeeFlavorsMade() {
		return flavors.size();
	}
}
