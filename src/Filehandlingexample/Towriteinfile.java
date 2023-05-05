package Filehandlingexample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Towriteinfile {
	public static void main(String[] args) throws IOException {
		try {
		File newfolder = new File("C:\\Users\\Roshan Jha\\eclipse-workspace\\Skillmine\\src\\ notes\\filehandlingnotes.text");
		
		FileWriter f = new FileWriter(newfolder,true);
		f.write("first line");
		System.out.println("Data is written in the file");
		f.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("File not written");
		}
	}

}
