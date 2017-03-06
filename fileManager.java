// class that will handle the files for different classes
// will create a new file and manage existing files

import java.io.File;
import java.io.FileWriter;;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Scanner;

public class fileManager {
	
    File file;
    FileWriter fw;
    BufferedWriter bw;

    public static void main(String args[]) throws Exception {
	fileManager test = new fileManager("CS331");
    }
    
    public fileManager(String fileName) throws Exception {
	try {
	    file = new File("courses/" + fileName + ".txt");
	    if (!file.exists()) {
	        file.createNewFile();
	    }
	    fw = new FileWriter(file.getAbsoluteFile(), true);
	    bw = new BufferedWriter(fw);
	} catch (IOException e) {
	    e.printStackTrace();
	}
    }
    
    public void write(String content) {
	bw.write(content);
    }

    public String readNext() {
	return sc.next();
    }

    public int readNextInt() {
	return sc.nextInt();
    }

    public double readNextDouble() {
	return sc.nextDouble();
    }
}
