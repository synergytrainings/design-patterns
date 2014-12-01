package main.com.synisys.trainings.designPatterns;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Case 1: without Proxy pattern use!
		// consider using the Person object directly
		// let's load 3 person objects in list
		Person person1 = new PersonImpl("Person 1");
		Person person2 = new PersonImpl("Person 2");
		Person person3 = new PersonImpl("Person 3");
				
		// assume that the client selects second person from list to see its details
		person2.showPersonData();
		
		// note that in this case all data have been loaded into memory 
		// and not all have been actually displayed
		// this is a waste of memory resources !!!
		
		
		// Case 2: via Proxy pattern
		Person personProxy1 = new PersonProxy("Person 1");
		Person personProxy2 = new PersonProxy("Person 2");
		Person personProxy3 = new PersonProxy("Person 3");
		
		// assume that the user clicks on first person in a list
		// this would cause the program to call showPersonData() for that person only
		// note that in this case only first person was loaded into memory
		personProxy1.showPersonData();

	}

}
