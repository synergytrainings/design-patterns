package com.synisys.models;

import com.synisys.interfaces.Command;
import com.synisys.interfaces.FileSystemReceiver;

public class WriteFileCommand implements Command{
	private FileSystemReceiver fileSystem;
    
    public WriteFileCommand(FileSystemReceiver fs){
        this.fileSystem=fs;
    }
    public void execute() {
        this.fileSystem.writeFile();
    }
}
