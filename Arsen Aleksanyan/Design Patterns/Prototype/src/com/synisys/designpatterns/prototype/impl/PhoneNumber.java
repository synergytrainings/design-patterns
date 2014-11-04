package com.synisys.designpatterns.prototype.impl;

import com.synisys.designpatterns.prototype.Copyable;

public class PhoneNumber implements Copyable<PhoneNumber> {
	private String areaCode;
	private String number;
	private boolean isMobile;
	
	private PhoneNumber(){
		
	}
	
	public PhoneNumber(String areaCode, String number, boolean isMobile){
		this.areaCode = areaCode;
		this.number = number;
		this.isMobile = isMobile;
	}
	
	//Copy Constructor
	public PhoneNumber(PhoneNumber phoneNumber){
		if(phoneNumber == null){
			throw new IllegalArgumentException("Provided phone number can't be null");
		}
		
		this.areaCode = phoneNumber.areaCode;
		this.number = phoneNumber.number;
		this.isMobile = phoneNumber.isMobile;
	}
	
	//Deep cloning implementation
	@Override
	public PhoneNumber copy() {
		PhoneNumber phoneNumber = new PhoneNumber();
		phoneNumber.areaCode = this.areaCode;
		phoneNumber.number = this.number;
		phoneNumber.isMobile = this.isMobile;
		return phoneNumber;
	}
}
