package com.synisys.models;

public class Car extends Product{
	private String model;
	
	public Car(Integer price, String name, String model) {
		super(price, name);
		this.model = model;
	}
	
	public Car clone(){
		return (Car) super.clone();
	}
}
