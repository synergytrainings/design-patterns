package main.com.synisys.trainigs.prototypePattern;

public class ProjectFactory {
	private static String PROJECT_1_KEY = "project1";
	private static String PROJECT_2_KEY = "project2";
	private static String PROJECT_3_KEY = "project3";

	/**
	 * Cache which holds base projects
	 */
	private static java.util.Map<String, Project> projects = new java.util.HashMap<>();

	static {
		projects.put(PROJECT_1_KEY, new Project(1, "Project A"));
		projects.put(PROJECT_2_KEY, new Project(2, "Project B",
				"Project B Description", 1));
		projects.put(PROJECT_3_KEY, new Project(3, "Project C",
				"Project C Description", null));
	}

	/**
	 * Creates the copy of passed project Uses
	 * {@link main.com.synisys.trainigs.prototypePattern.Copyable#copy()} method
	 * 
	 * @param key
	 *            the original project key
	 * @return new project which is the copy of the passed one
	 */
	public static Project createProject(String key) {
		return (Project) (projects.get(key)).copy();
	}

	/**
	 * Creates the copy of passed project also taking into account the deep or
	 * shallow copy mode for new project data Uses
	 * {@link main.com.synisys.trainigs.prototypePattern.Copyable#copy(boolean shallow)}
	 * method
	 * 
	 * @param key
	 *            the original project key
	 * @param shellow
	 *            indicates whether deep or shallow copy should be done for the
	 *            new object
	 * @return
	 */
	public static Project createProject(String key, boolean shellow) {
		return (Project) (projects.get(key)).copy(shellow);
	}

	/**
	 * Creates the clone of passed project Uses {@link java.lang.Object#clone()}
	 * method
	 * 
	 * @param key
	 * @return
	 */
	public static Project cloneProject(String key) {
		return (Project) (projects.get(key)).clone();
	}

	public static void main(String[] args) {
		// copy projects...
		Object project1Copy = ProjectFactory.createProject(PROJECT_1_KEY);
		Object project2Copy = ProjectFactory.createProject(PROJECT_2_KEY);
		Object project3Copy = ProjectFactory.createProject(PROJECT_3_KEY, true);
		Object project4Copy = ProjectFactory
				.createProject(PROJECT_3_KEY, false);

		System.out.println(project1Copy.toString());
		System.out.println(project2Copy.toString());
		System.out.println(project3Copy.toString());
		System.out.println(project4Copy.toString());

		// clone project...
		Object project5Copy = ProjectFactory.cloneProject(PROJECT_3_KEY);
		System.out.println(project5Copy.toString());
	}
}
