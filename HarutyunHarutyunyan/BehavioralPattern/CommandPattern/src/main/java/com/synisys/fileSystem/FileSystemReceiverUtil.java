package com.synisys.fileSystem;

import com.synisys.receiver.FileSystemReceiver;
import com.synisys.receiver.UnixFileSystemReceiver;
import com.synisys.receiver.WindowsFileSystemReceiver;

public class FileSystemReceiverUtil {

	public static FileSystemReceiver getUnderlyingFileSystem() {
		String osName = System.getProperty("os.name");
		if (osName.contains("Windows")) {
			return new WindowsFileSystemReceiver();
		} else {
			return new UnixFileSystemReceiver();
		}
	}

}