package com.synisys.training;

public class FactoryProducer {
	public static AbstractFactory getFactory(String type){
		if(type == null)
			return null;
		if(type.equals("Plane")){
			return new PlaneFactory();
		}
		if(type.equals("Car")){
			return new CarFactory();
		}
		return null;
	}
}
