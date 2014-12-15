package com.synisys.models;

import com.synisys.interfaces.Command;
import com.synisys.interfaces.FileSystemReceiver;

public class CloseFileCommand implements Command {

	private FileSystemReceiver fileSystem;

	public CloseFileCommand(FileSystemReceiver fs) {
		this.fileSystem = fs;
	}

	public void execute() {
		this.fileSystem.closeFile();
	}

}
