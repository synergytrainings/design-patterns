package com.synisys.designpatterns.prototype.impl;

import com.synisys.designpatterns.prototype.Copyable;

public class Address implements Copyable<Address> {
	private String city;
	private String street;
	private String building;
	private int apartment;
	
	private Address(){
		
	}
	
	public Address(String city, String street, String building, int apartment){
		this.city = city;
		this.street = street;
		this.building = building;
		this.apartment = apartment;
	}
	
	//Copy constructor implementation
	public Address(Address address){
		if(address == null){
			throw new IllegalArgumentException("Provided address can't be null");
		}
		
		this.city = address.city;
		this.street = address.street;
		this.building = address.building;
		this.apartment = address.apartment;
	}
	
	//Deep cloning implementation
	@Override
	public Address copy() {
		Address address = new Address();
		address.city = this.city;
		address.street = this.street;
		address.building = this.building;
		address.apartment = this.apartment;
		
		return address;
	}
}
