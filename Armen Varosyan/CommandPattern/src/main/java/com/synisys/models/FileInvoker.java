package com.synisys.models;

import com.synisys.interfaces.Command;

public class FileInvoker {
	public Command command;

	public FileInvoker(Command c) {
		this.command = c;
	}

	public void execute() {
		this.command.execute();
	}
}
