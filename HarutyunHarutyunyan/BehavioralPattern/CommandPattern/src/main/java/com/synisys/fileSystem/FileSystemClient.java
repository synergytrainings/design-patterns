package com.synisys.fileSystem;

import com.synisys.cammand.CloseFileCommand;
import com.synisys.cammand.OpenFileCommand;
import com.synisys.cammand.WriteFileCommand;
import com.synisys.receiver.FileSystemReceiver;

public class FileSystemClient {

	public static void main(String[] args) {
		// Creating the receiver object
		FileSystemReceiver fs = FileSystemReceiverUtil
				.getUnderlyingFileSystem();

		// creating command and associating with Receiver
		OpenFileCommand openFileCommand = new OpenFileCommand(fs);

		FileInvoker fileInvoker = new FileInvoker();

		fileInvoker.execute(openFileCommand);

		WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
		fileInvoker.execute(writeFileCommand);

		CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
		fileInvoker.execute(closeFileCommand);
	}

}