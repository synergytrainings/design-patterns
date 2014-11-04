package com.synisys.designpatterns.prototype.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.synisys.designpatterns.prototype.Copyable;
import com.synisys.designpatterns.prototype.utils.Gender;

public class Person implements Copyable<Person> {
	private List<PhoneNumber> phoneNumbers;
	private String[] emails;
	private Address address;
	private Gender gender;
	private String name;
	private int age;
	
	private Person(){
		
	}
	
	public Person(String name, int age, Gender gender, Address address, String[] emails, List<PhoneNumber> phoneNumbers){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		if(emails != null){
			this.emails = Arrays.copyOf(emails, emails.length);
		}
		if(phoneNumbers != null){
			this.phoneNumbers = new ArrayList<>(phoneNumbers);
		}
	}
	
	//Copy constructor implementation
	public Person(Person person){
		if(person == null){
			throw new IllegalArgumentException("Provided person can't be null");
		}
		
		this.name = person.name;
		this.age = person.age;
		this.gender = person.gender;
		this.address = new Address(person.address);
		if(person.emails != null){
			this.emails = person.emails.clone();
		}
		if(person.phoneNumbers != null){
			this.phoneNumbers = new ArrayList<PhoneNumber>();
			
			for(PhoneNumber phoneNumber : person.phoneNumbers){
				this.phoneNumbers.add(new PhoneNumber(phoneNumber));
			}
		}
	}
	
	//Deep cloning implementation
	@Override
	public Person copy() {
		Person person = new Person();
		//copying simple attributes
		person.name = this.name;
		person.age = this.age;
		person.gender = this.gender;
		
		//copying objects
		person.address = this.address.copy();
		if(this.emails != null){
			person.emails = this.emails.clone();
		}
		if(this.phoneNumbers != null){
			person.phoneNumbers = new ArrayList<PhoneNumber>();
		
			for(PhoneNumber phoneNumber : this.phoneNumbers){
				person.phoneNumbers.add(phoneNumber.copy());
			}
		}
		
		return person;
	}
}
