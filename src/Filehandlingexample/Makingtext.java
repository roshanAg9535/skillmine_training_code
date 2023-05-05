package Filehandlingexample;

import java.io.File;
import java.io.IOException;

public class Makingtext {
	public static void main(String[] args) throws IOException {
		//making a text file using the file class
		File newfolder = new File("C:\\Users\\Roshan Jha\\eclipse-workspace\\Skillmine\\src\\ notes\\filehandlingnotes.text");
		if(!(newfolder.exists())) {
		newfolder.createNewFile();
		System.out.println("The file is created");
		}
		else
		{
			System.out.println("The file already exists");
		}
		/*boolean result = newfolder.createNewFile();
		if(result)
		{
			System.out.println("The file is created");
		}
		else
		{
			System.out.println("The file already exists");
		}*/
	}

}
