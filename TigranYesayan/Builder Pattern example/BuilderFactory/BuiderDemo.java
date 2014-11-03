package com.synisys.trainings.BuilderFactory;

public class BuiderDemo {

	public static void main(String[] args) {
		try{
		Contact user1 = new Contact.ContactBuilder("FirstName", "LastName","firstName.lastName@mail.mm").phoneNumber("555 000 000 000")
				.organisation("MGM")
				.build();
		System.out.println(user1);
		}
		catch(IllegalArgumentException e){
			e.printStackTrace();
		} 

		try{
		Contact user2 = new Contact.ContactBuilder("FirstName", "LastName","firstName.lastName@mailmm").phoneNumber("555 000 000 000").build();
		System.out.println(user2);
		}
		catch(IllegalArgumentException e){
			e.printStackTrace();
		} 
		try{
			Contact user3 = new Contact.ContactBuilder("FirstName", "LastName","firstName.lastName@mail.mm").build();
			System.out.println(user3);
		}
		catch(IllegalArgumentException e){
			e.printStackTrace();
		} 
	}
}
