package com.synisys.trainings.mediator;

public class ParkingMediatorImpl implements ParkingMediator{
	private Car	car;
	private ParkingPlace parkingPlace;
	public boolean parkingStatus;

	public void registerCar(Car	car) {
		this.car = car;
	}

	public void registerParkingPlace(ParkingPlace parkingPlace) {
		this.parkingPlace = parkingPlace;
	}

	public boolean isExistparkingPlace() {
		return parkingStatus;
	}

	@Override
	public void setParkingStatus(boolean status) {
		parkingStatus = status;

	}
}
