package com.synisys.training.patterns.composite;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.assertTrue;


public class TestFileSystemItem {


	private Path tmp_directory_1;
	private Path tmp_directory_1_2;
	private Path tmp_directory_1_3;
	private Path tmp_file_1_2_test;

	private FileSystemItemFactory itemFactory;

	/**
	 * Creates temporary folders and files for testing.
	 */
	@Before
	public void setUp() throws IOException {

		this.itemFactory = new FileSystemItemFactory();
		Path tempPath = Paths.get(System.getProperty("java.io.tmpdir"));

		tmp_directory_1 = Paths.get(tempPath.toString(), "1");
		tmp_directory_1_2 = Paths.get(tempPath.toString(), "1", "2");
		tmp_directory_1_3 = Paths.get(tempPath.toString(), "1", "3");
		tmp_file_1_2_test = Paths.get(tempPath.toString(), "1", "2", "test.txt");

		deleteTempFiles();

		Files.createDirectory(tmp_directory_1);
		Files.createDirectory(tmp_directory_1_2);
		Files.createDirectory(tmp_directory_1_3);
		Files.createFile(tmp_file_1_2_test);

	}

	@After
	public void cleanUp() throws IOException {
		deleteTempFiles();
	}


	@Test
	public void testDeleteDirectory() throws IOException {
		FileSystemItem item = this.itemFactory.getFileSystemItem(tmp_directory_1);

		item.delete();

		assertTrue(Files.notExists(tmp_directory_1));

	}

	@Test
	public void testDeleteFile() throws IOException {
		FileSystemItem item = this.itemFactory.getFileSystemItem(tmp_file_1_2_test);

		item.delete();

		assertTrue(Files.notExists(tmp_file_1_2_test));

	}


	@Test
	public void testDirectoryMove() throws IOException {
		FileSystemItem item = this.itemFactory.getFileSystemItem(tmp_directory_1);
		Path newDirectory = tmp_directory_1.resolveSibling("1_copy");

		item.moveTo(newDirectory.toString());

		assertTrue(Files.notExists(tmp_directory_1));
		assertTrue(Files.exists(newDirectory));
		assertTrue(Files.exists(Paths.get(newDirectory.toString(), "1")));
		assertTrue(Files.exists(Paths.get(newDirectory.toString(), "1", "2")));
		assertTrue(Files.exists(Paths.get(newDirectory.toString(), "1", "2", "test.txt")));

		FileUtils.forceDelete(newDirectory.toFile());
	}


	@Test
	public void testFileMove() throws IOException {
		FileSystemItem item = this.itemFactory.getFileSystemItem(tmp_file_1_2_test);
		Path newPlace = tmp_directory_1_3;
		Path newFilePath = Paths.get(newPlace.toString(), tmp_file_1_2_test.getFileName().toString());

		item.moveTo(newPlace.toString());

		assertTrue(Files.notExists(tmp_file_1_2_test));
		assertTrue(Files.exists(newFilePath));
		FileUtils.forceDelete(newFilePath.toFile());
	}


	private void deleteTempFiles() throws IOException {
		if (Files.exists(tmp_directory_1)) {
			FileUtils.forceDelete(tmp_directory_1.toFile());
		}
	}


}
