package com.synisys.trainings.mediator;

public interface ParkingMediator {
	public void registerCar(Car car);

	public void registerParkingPlace(ParkingPlace parkingPlace);

	public boolean isExistparkingPlace();
	
	public void setParkingStatus(boolean status);
}
