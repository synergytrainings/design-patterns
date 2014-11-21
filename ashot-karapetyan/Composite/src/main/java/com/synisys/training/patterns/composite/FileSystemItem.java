package com.synisys.training.patterns.composite;

import java.io.IOException;

public interface FileSystemItem {

	double size() throws IOException;

	void delete() throws IOException;

	void moveTo(String directory) throws IOException;

}
