package main.com.synisys.trainings.designPatterns;

import main.com.synisys.trainings.designPatterns.impl.FacadeImpl;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Facade facade = new FacadeImpl();

		facade.drawChart("Simple Chart");
		facade.drawList("Simple List");
		facade.drawMap("Simple Map");

		facade.drawReport("Simple Report", new String[] { "Report Chart 1",
				"Report Chart 2" }, new String[] { "Report List 1",
				"Report List 2" });
	}

}
