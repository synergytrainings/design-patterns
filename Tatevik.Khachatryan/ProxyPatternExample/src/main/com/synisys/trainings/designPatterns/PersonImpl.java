package main.com.synisys.trainings.designPatterns;

public class PersonImpl implements Person {
	public PersonImpl(String name) {
		loadPersonData(name);
	}

	private void loadPersonData(String name) {
		// load Person data from remote server via API
		// this is heavy and costly operation
		System.out.println(String.format("Loading Person %s data...", name));
	}

	@Override
	public void showPersonData() {
		// Person data rendering logic
		System.out.println("Rendering Person data...");
	}
}
