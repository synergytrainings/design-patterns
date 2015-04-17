package main.com.synisys.trainings.designPattern;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// initialize test Project and PIPProject
		List<Location> deItemLocations = new ArrayList<>();
		deItemLocations.add(new Location("LC1", 1, "Location 1"));
		deItemLocations.add(new Location("LC2", 2, "Location 2"));
		deItemLocations.add(new Location("LC3", 3, "Location 3"));

		DeItemTemplate project = new Project("PRJ", "Project", deItemLocations);

		List<Location> deItemLocations2 = new ArrayList<>();
		deItemLocations2.add(new Location("LC4", 4, "Location 4"));
		deItemLocations2.add(new Location("LC5", 5, "Location 5"));
		DeItemTemplate pipProject = new PipProject("PIPPRJ", "PIPProject",
				deItemLocations2);

		// using template method
		System.out.println(project.generateCode());
		System.out.println(pipProject.generateCode());

		// RESULT:
		// PRJ-Project32015
		// PIPPRJ-PIPProject-LC4
	}

}
