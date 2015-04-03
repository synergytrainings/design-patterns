package main.com.synisys.trainings.designPatterns;

public class Demo {
	public static void main(String[] args) {

		Project project = new Project(1, "Project 001",
				"Project Number One Title");
		ProjectCaretaker caretaker = new ProjectCaretaker();

		project.setCode("Project 001-new");

		System.out.println(String.format("Saving state 1: %s", project));
		caretaker.addMemento(project.save());

		project.setTitle("Project Number One Title - new");
		project.setCode("Project 001-new2");

		System.out.println(String.format("Saving state 2: %s", project));
		caretaker.addMemento(project.save());

		// restore first state...
		System.out.println("Restore First State...");
		project.restore(caretaker.getMemento(0));
		System.out.println(project);

		// restore second state...
		System.out.println("Restore Second State...");
		project.restore(caretaker.getMemento(1));
		System.out.println(project);

		/*
		 * Result:
		 * 
		 * Saving state 1: Id: 1, code: Project 001-new, title: Project Number
		 * One Title Saving state 2: Id: 1, code: Project 001-new2, title:
		 * Project Number One Title - new Restore First State... Id: 1, code:
		 * Project 001-new, title: Project Number One Title Restore Second
		 * State... Id: 1, code: Project 001-new2, title: Project Number One
		 * Title - new
		 */
	}
}
