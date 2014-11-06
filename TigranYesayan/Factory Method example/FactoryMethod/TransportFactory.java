package com.synisys.trainings.FactoryMethod;

public class TransportFactory {
	public static Transport createTransport(TransportType transportType) {
		switch (transportType) {
			case BUS:
				return new Bus();
			case STREETCAR:
				return new Streetcar();
			case TROLLEYBUS:
				return new Trolleybus();
			default:
				throw new IllegalArgumentException("Such Trasport not exist");
		}
	}
}
