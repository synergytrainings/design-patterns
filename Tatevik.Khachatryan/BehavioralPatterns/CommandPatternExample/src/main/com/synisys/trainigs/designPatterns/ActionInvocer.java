package main.com.synisys.trainigs.designPatterns;

public class ActionInvocer {
	Command command;

	public ActionInvocer(Command command) {
		this.command = command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void invoke() {
		command.execute();
	}
}
