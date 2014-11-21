package com.synisys.training.patterns.composite;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * FileSystemItem creator factory.
 */
public class FileSystemItemFactory {

	public static FileSystemItem getFileSystemItem(String itemPath){
		return getFileSystemItem(Paths.get(itemPath));
	}

	public static FileSystemItem getFileSystemItem(Path itemPath){
		String absolutePAth = itemPath.toAbsolutePath().toString();
		if(Files.isDirectory(itemPath)){
			return new Directory(absolutePAth);
		}else{
			return new File(absolutePAth);
		}
	}
}
