package com.synisys.training;

public class AbstractFactoryDemo {
	public static void main(String[] args) {
		
		AbstractFactory planeFactory = FactoryProducer.getFactory("Plane");
		Plane plane1 = planeFactory.getPlane(PlaneFirm.AIRBUS);
		plane1.fly();
		Plane plane2 = planeFactory.getPlane(PlaneFirm.LUFTHANSA);
		plane2.fly();
		
		AbstractFactory carFactory = FactoryProducer.getFactory("Car");
		Car car1 = carFactory.getCar(CarFirm.MERCEDES);
		car1.drive();
		Car car2 = carFactory.getCar(CarFirm.BMW);
		car2.drive();
		Car car3 = carFactory.getCar(CarFirm.TOYOTA);
		car3.drive();
	}
}
