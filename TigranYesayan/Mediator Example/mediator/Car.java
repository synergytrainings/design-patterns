package com.synisys.trainings.mediator;

public class Car implements Command{
	private ParkingMediator parkingMediator;

	public Car(ParkingMediator parkingMediator) {
		this.parkingMediator = parkingMediator;
	}

	public void parking() {
		if (parkingMediator.isExistparkingPlace()) {
			System.out.println("parking done....");
			parkingMediator.setParkingStatus(true);
		} else
			System.out.println("Will wait for parking....");
	}
}
