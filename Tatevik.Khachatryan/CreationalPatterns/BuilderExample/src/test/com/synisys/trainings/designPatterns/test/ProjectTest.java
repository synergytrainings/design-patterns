package com.synisys.trainings.designPatterns.test;

import java.util.ArrayList;
import java.util.Date;
import org.junit.Test;

import com.synisys.trainings.designPatterns.*;

public class ProjectTest {

	@Test
	public void test() {
		// Test1 - build project1 without contacts
		Project project = new Project.Builder("Project title", new Date(
				System.currentTimeMillis()), new Organisation(
				"Synergy International Systems", "Arghutyan 2/5"))
				.description("Project Description")
				.endDate(new Date(System.currentTimeMillis()))
				.contacts(null)
				.build();
		System.out.println(project.toString());
		
		// build test contacts
		ArrayList<Contact> contacts = new ArrayList<>();
		Contact contact1 = new Contact.Builder("email1@synisys.com").firstName("Anna").lastName("Smith").build();
		contacts.add(contact1);
		
		Contact contact2 = new Contact.Builder("email2@synisys.com").build();
		contacts.add(contact2);
		
		Contact contact3 = new Contact.Builder("email3@synisys.com").firstName("Jhone").lastName("Elton").phone("55-55-55").build();
		contacts.add(contact3);
		
		// Test2 - build project2 with contacts
		Project project2 = new Project.Builder("Project title2", new Date(
				System.currentTimeMillis()), new Organisation(
				"Synergy International Systems", "Arghutyan 2/5"))
				.description("Project Description 2")
				.endDate(new Date(System.currentTimeMillis()))
				.contacts(contacts)
				.build();
		System.out.println(project2.toString());
	}

}
