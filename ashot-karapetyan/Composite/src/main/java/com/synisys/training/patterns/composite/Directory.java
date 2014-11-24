package com.synisys.training.patterns.composite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Directory implements FileSystemItem {

	private List<FileSystemItem> children = new ArrayList<>();
	private final FileSystemItemFactory fileSystemItemFactory = new FileSystemItemFactory();
	private final Path path;

	protected Directory(String path) {
		this.path = Paths.get(path);
		String[] childFiles = new java.io.File(this.path.toString()).list();
		for (String childFile : childFiles) {
			children.add(getFileSystemItemFactory().getFileSystemItem(Paths.get(path, childFile).toAbsolutePath().toString()));
		}
	}


	@Override
	public double size() throws IOException {
		double size = 0;
		for (FileSystemItem item : children) {
			size += item.size();
		}
		return size;
	}

	@Override
	public void delete() throws IOException {
		for (FileSystemItem item : children) {
			item.delete();
		}
		Files.delete(this.path);
	}

	@Override
	public void moveTo(String directory) throws IOException {
		Path destinationDirectory = Paths.get(directory, this.path.getFileName().toString());
		Files.createDirectories(destinationDirectory);
		for (FileSystemItem item : this.children) {
			item.moveTo(destinationDirectory.toAbsolutePath().toString());
		}
		Files.delete(this.path);

	}


	private FileSystemItemFactory getFileSystemItemFactory() {
		return this.fileSystemItemFactory;
	}

}
