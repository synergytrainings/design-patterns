package main.com.synisys.trainigs.designPatterns;

import java.util.ArrayList;
import java.util.List;

import main.com.synisys.trainigs.designPatterns.impl.*;

public class Demo {
	public static void main(String[] args) {
		// init receivers...
		DeItem project1 = new Project("Project1");
		DeItem project2 = new Project("Project2");
		DeItem pipProject1 = new PipProject("PipProject1");
		DeItem pipProject2 = new PipProject("PipProject2");
		DeItem pipProject3 = new PipProject("PipProject3");

		// init commands...
		Command projectSubmitCommand = new SubmitCommand(project1);
		Command pipProjectSubmitCommand = new SubmitCommand(pipProject1);

		List<DeItem> deItems = new ArrayList<>();
		deItems.add(project2);
		deItems.add(pipProject2);
		deItems.add(pipProject3);

		Command approveAllCommand = new ApproveAllCommand(deItems);

		// init invocer to run actions
		ActionInvocer actionInvocer = new ActionInvocer(projectSubmitCommand);
		actionInvocer.invoke();

		// set second command in action invocer
		actionInvocer.setCommand(pipProjectSubmitCommand);
		actionInvocer.invoke();

		// set third command in action invocer
		actionInvocer.setCommand(approveAllCommand);
		actionInvocer.invoke();
	}
}
