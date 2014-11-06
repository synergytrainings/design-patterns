package com.synisys.trainings.FactoryMethod;

public class FactoryDemo {
	public static void main(String[] args) {
		System.out.println(TransportFactory.createTransport(TransportType.BUS).getTransportNumber());
		System.out.println(TransportFactory.createTransport(TransportType.STREETCAR).getTransportNumber());
		System.out.println(TransportFactory.createTransport(TransportType.TROLLEYBUS).getTransportNumber());
	}
}
