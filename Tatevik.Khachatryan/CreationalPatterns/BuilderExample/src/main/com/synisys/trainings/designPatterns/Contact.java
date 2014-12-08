package com.synisys.trainings.designPatterns;

public class Contact {
	private final String firstName;
	private final String lastName;
	private final String email;
	private final String phone;

	public static class Builder {
		// required parameters
		private final String email;
		// Optional parameters - initialized to default values
		private String firstName = null;
		private String lastName = null;
		private String phone = null;

		public Builder(String email) {
			this.email = email;
		}

		public Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public Contact build() {
			return new Contact(this);
		}
	}

	private Contact(Builder builder) {
		firstName = builder.firstName;
		lastName = builder.lastName;
		email = builder.email;
		phone = builder.phone;
	}

	public String toString() {
		StringBuilder contactStr = new StringBuilder("Contact - ");
		contactStr.append(firstName == null ? "" : (firstName + " "))
				.append(lastName == null ? "" : lastName).append("\n");
		contactStr.append("Email: ").append(email == null ? "" : email)
				.append("\n");
		contactStr.append("Phone: ").append(phone == null ? "" : phone)
				.append("\n");
		return contactStr.toString();
	}
}
