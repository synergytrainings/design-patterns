package com.synisys.trainings.Bridge;

public class GermanianCar extends AbstractCar{

	public GermanianCar(Car car) {
		super(car);
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	private String country;

}
