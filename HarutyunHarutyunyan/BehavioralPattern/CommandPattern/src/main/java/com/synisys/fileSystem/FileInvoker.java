package com.synisys.fileSystem;

import java.util.ArrayList;
import java.util.List;

import com.synisys.cammand.Command;

public class FileInvoker {
	private List<Command> history = new ArrayList<Command>();

	public void storeAndExecute(Command command) {
		this.history.add(command);
		command.execute();
	}

	public void execute(Command command) {
		command.execute();
	}
}
