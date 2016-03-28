// class that will handle the files for different classes
// will create a new file and manage existing files

import java.io.*;
import java.util.Scanner;
import java.io.File;

public class fileManager {
	
	File[] files = new File[10];
	private int counter;
	private Scanner sc;

	// purpose of this code is to create access a file, or create a new one
	// if we don't already have a file with that name
	
	// there is an error in the code somewhere here, need to go through
	// and understand it then find the bug
	public fileManager(String fileName) throws Exception {
		File folder = new File("~/randomProjects/gradeChecker/courses");
		listFilesForFolder(folder);
		String path = "~/randomProjects/gradeChecker/courses/" + fileName;
		boolean newCourse = true;
		for (File i : files) {
			if (i.getName().equals(fileName)) {
			    newCourse = false;
			    sc = new Scanner(i);
			    break;
			}
		}
		if (newCourse == true) {
		    files[counter] = new File(path);
		    files[counter].getParentFile().mkdir();
		    files[counter].createNewFile();
		    // might be an error
		    sc = new Scanner(path);
		}
	}
	
	public Scanner getScanner() {
	    return sc;
	}

	public void listFilesForFolder(final File folder) {
		counter  = 0;
		for (final File fileEntry : folder.listFiles()) {
			if (fileEntry.isDirectory()) {
				listFilesForFolder(fileEntry);
			} else {
				files[counter] = fileEntry;
				counter++;
			}
		}
	}

}
