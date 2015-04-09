package main.com.synisys.trainings.designPatterns.impl;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Context context = new Context();

		context.printForm();
		context.printForm();
		context.setState(new EditModeState());
		context.printForm();
		context.printForm();
		context.setState(new ViewModeState());
		context.printForm();

		/*
		 * Result is: 
		 * 
		 * Project is in view mode... Just print project form...
		 * Project is in view mode... Just print project form... 
		 * Project is in edit mode... Format form layout, then print project... 
		 * Project is in edit mode... Format form layout, then print project... 
		 * Project is in view mode... Just print project form...
		 */
	}

}
