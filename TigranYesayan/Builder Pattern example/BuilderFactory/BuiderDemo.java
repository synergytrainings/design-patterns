package com.synisys.trainings.BuilderFactory;

public class BuiderDemo {

	public static void main(String[] args) {
		Contact user1 = new Contact.ContactBuilder("FirstName", "LastName","firstName.lastName@mail.mm").phoneNumber("555 000 000 000")
				.organisation("MGM")
				.build();
		System.out.println(user1);

		Contact user2 = new Contact.ContactBuilder("FirstName", "LastName","firstName.lastName@mail.mm").phoneNumber("555 000 000 000").build();
		System.out.println(user2);

		try{
			Contact user3 = new Contact.ContactBuilder("FirstName", "LastName","firstName.lastName@mail.mm").build();
			System.out.println(user3);
		}
		catch(IllegalArgumentException e){
			e.printStackTrace();
		} 
	}
}
