package com.synisys.trainings.Bridge;

public class AbstractCar {
	Car car;
	public AbstractCar(Car car){
		this.car = car;
	}
	
	public String getPrice(){
		return car.getPrice();
	}
	
	public String getModel(){
		return car.getModel();
	}
}
