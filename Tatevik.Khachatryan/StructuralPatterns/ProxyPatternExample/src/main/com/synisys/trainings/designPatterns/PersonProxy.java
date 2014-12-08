package main.com.synisys.trainings.designPatterns;

public class PersonProxy implements Person {
	/**
	 * Private Proxy data
	 */
	private String personName;

	/**
	 * Reference to RealSubject
	 */
	private Person proxifiedPerson;

	public PersonProxy(String personName) {
		this.personName = personName;
	}

	@Override
	public void showPersonData() {
		// create the PersonImpl Object only when Person data is required to be
		// shown
		proxifiedPerson = new PersonImpl(this.personName);

		// now call showPersonData on real Person object
		proxifiedPerson.showPersonData();
	}
}
