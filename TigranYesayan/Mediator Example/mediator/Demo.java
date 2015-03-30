package com.synisys.trainings.mediator;

public class Demo {
	public static void main(String[] args) {
		ParkingMediator parkingMediator = new ParkingMediatorImpl();
		Car car = new Car(parkingMediator);
		ParkingPlace parkingPlace = new ParkingPlace(parkingMediator);
		
		parkingMediator.registerParkingPlace(parkingPlace);
		parkingMediator.registerCar(car);
		
		parkingPlace.parking();
		car.parking();
	}
}
