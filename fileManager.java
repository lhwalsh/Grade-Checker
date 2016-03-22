// class that will handle the files for different classes
// will create a new file and manage existing files

import java.io.*;
import java.util.Scanner;
import java.io.File;

public class fileManager {
	
	String[] files = new String[10];

	public fileManager(String fileName) throws Exception {
		final File folder = new File("~/randomProjects/gradeChecker/courses");
		listFilesForFolder(folder);
		boolean test = true;
		for (String i : files) {
			if (i.equals(fileName)) 
				test = false;
		}
		if (test == true) {
			PrintWriter newCourse = new PrintWriter(fileName, "UTF-8");	
			newCourse.println("test");
		}
	}

	public void listFilesForFolder(final File folder) {
		int counter  = 0;
		for (final File fileEntry : folder.listFiles()) {
			if (fileEntry.isDirectory()) {
				listFilesForFolder(fileEntry);
			} else {
				System.out.println(fileEntry.getName());
				files[counter] = fileEntry.getName();
				counter++;
			}
		}
	}

}
