package com.synisys.training.patterns.genericbuilder;

/**
 * Created by Ashot Karapetyan on 11/4/2014.
 */

public class ContactInfo {
	private final String firstName;
	private final String lastName;
	private final String eMail;

	public static class False {
	}

	public static class True {
	}

	public ContactInfo(Builder<True, True, True> builder){
		firstName = builder.firstName;
		lastName = builder.lastName;
		eMail = builder.eMail;
	}


	public static class Builder<HasFirstName, HasLastName, HasEmail> {
		private String firstName;
		private String lastName;
		private String eMail;

		private Builder() {
		}


//		public static Builder<False, False, False> create() {
//			return new Builder<False, False, False>();
//		}

		public Builder<True, HasLastName, HasEmail> first(String first) {
			this.firstName = first;
			return (Builder<True, HasLastName, HasEmail>) this;
		}

		public Builder<HasFirstName, True, HasEmail> lastName(String lastName) {
			this.lastName = lastName;
			return (Builder<HasFirstName, True, HasEmail>) this;
		}

		public Builder<HasFirstName, HasLastName, True> eMail(String eMail) {
			this.eMail = eMail;
			return (Builder<HasFirstName, HasLastName, True>) this;
		}
	}

	public static class BuilderWrapper extends Builder<False, False, False>  {
		public static BuilderWrapper  create() {
			return new BuilderWrapper();
		}

	}

	public void test(){
		ContactInfo.BuilderWrapper builder = ContactInfo.BuilderWrapper.create();

		ContactInfo info = new ContactInfo(builder.first("AAA").eMail("ccc@ccc.cc").lastName("BBB"));

	}


}
