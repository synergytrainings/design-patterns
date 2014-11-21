package com.synisys.training.patterns.composite;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class File implements FileSystemItem {

	private final Path path;

	protected File(String fileName) {
		this.path = Paths.get(fileName);
	}

	@Override
	public double size() throws IOException {
		return Files.size(this.path);
	}

	@Override
	public void delete() throws IOException {
		Files.delete(this.path);
	}

	@Override
	public void moveTo(String destinationDirectory) throws IOException {
		Files.move(this.path, Paths.get(destinationDirectory, this.path.getFileName().toString()), StandardCopyOption.REPLACE_EXISTING);
	}

}
