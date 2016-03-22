// class that will handle the files for different classes
// will create a new file and manage existing files

import java.io.*;
import java.util.Scanner;
import java.io.File;

public class fileManager {
	
	String[] files = new String[10];

	// purpose of this code is to create access a file, or create a new one
	// if we don't already have a file with that name
	
	// most of this code I copied from stackoverflow

	// there is an error in the code somewhere here, need to go through
	// and understand it then find the bug
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
			    // this code isn't what I want
			    // not sure what I'll want to put here but it will most likely
			    // be pulling a text file and reading through it to find the 
			    // data for the class
				System.out.println(fileEntry.getName());
				files[counter] = fileEntry.getName();
				counter++;
			}
		}
	}

}
