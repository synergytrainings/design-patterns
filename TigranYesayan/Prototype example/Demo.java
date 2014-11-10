package com.synisys.trainings.Prototype;

public class Demo {
	public static void main(String[] args) {
		TransportCache.loadCache();

		Bus clonedBus = (Bus) TransportCache.getTransport("Bus");
		System.out.println(clonedBus.getName() + " " + clonedBus.getCountOfSeats() + " " + clonedBus.getNumber());

		Streetcar clonedStreetcar = (Streetcar) TransportCache.getTransport("Streetcar");
		System.out.println(clonedStreetcar.getName()
				+ " "
				+ clonedStreetcar.getOwner()
				+ " "
				+ clonedStreetcar.getNumber());

	}
}
