package com.synisys.models;

import com.synisys.interfaces.FileSystemReceiver;

public class WindowsFileSystemReceiver implements FileSystemReceiver {

	public void openFile() {
		System.out.println("Opening file in Windows OS");

	}

	public void writeFile() {
		System.out.println("Writing file in Windows OS");
	}

	public void closeFile() {
		System.out.println("Closing file in Windows OS");
	}

}
