package com.synisys.trainings.Prototype;

import java.util.Hashtable;

public class TransportCache {
	private static Hashtable<String, Transport> productMap = new Hashtable<String, Transport>();

	public static Transport getTransport(String transportName) {
		Transport cachedTransport = (Transport) productMap.get(transportName);
		return (Transport) cachedTransport.clone();
	}

	public static void loadCache() {
		Streetcar streetcar = new Streetcar();
		streetcar.setOwner("Owner");
		streetcar.setName("Streetcar");
		streetcar.setNumber(11);
		productMap.put(streetcar.getName(), streetcar);
		Bus bus = new Bus();
		bus.setCountOfSeats(15);
		bus.setName("Bus");
		bus.setNumber(10);
		productMap.put(bus.getName(), bus);
	}
}
