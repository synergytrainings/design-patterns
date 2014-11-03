package com.synisys.trainings.BuilderFactory;


public class Contact {
	private final String firstName;
	private final String lastName;
	private final String organisation;
	private final String phoneNumber;
	private final String emailAddress;

	private Contact(ContactBuilder contactBuilder) {
		this.firstName = contactBuilder.firstName;
		this.lastName = contactBuilder.lastName;
		this.organisation = contactBuilder.organisation;
		this.phoneNumber = contactBuilder.phoneNumber;
		this.emailAddress = contactBuilder.emailAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getOrganisation() {
		return organisation;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	@Override
	public String toString() {
		return "Contact information: "
				+ this.firstName
				+ ", "
				+ this.lastName
				+ ", "
				+ this.organisation
				+ ", "
				+ this.phoneNumber
				+ ", "
				+ this.emailAddress;
	}

	public static class ContactBuilder {
		private final String firstName;
		private final String lastName;
		private String organisation;
		private String phoneNumber;
		private final String emailAddress;

		public ContactBuilder(String firstName, String lastName, String emailAddress) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.emailAddress = emailAddress;
		}

		public ContactBuilder phoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}

		public ContactBuilder organisation(String organisation) {
			this.organisation = organisation;
			return this;
		}

		public Contact build() {
			if (!correctContact()) throw new IllegalArgumentException("Wrong data was entered"); // thread-safe
			return new Contact(this);
		}

		public boolean correctContact() {
			if (firstName == null || firstName.equals("") || lastName == null || lastName.equals("") || !org.apache.commons.validator.routines.EmailValidator.getInstance().isValid(emailAddress)) return false;
			return true;
		}
	}

}
