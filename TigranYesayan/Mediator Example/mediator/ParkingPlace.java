package com.synisys.trainings.mediator;

public class ParkingPlace implements Command{
	private ParkingMediator parkingMediator;
	
	public ParkingPlace(ParkingMediator parkingMediator) {
		this.parkingMediator = parkingMediator;
		parkingMediator.setParkingStatus(true);
	}

	@Override
	public void parking() {
		System.out.println("Parking permission granted...");
		parkingMediator.setParkingStatus(true);
	}
}
