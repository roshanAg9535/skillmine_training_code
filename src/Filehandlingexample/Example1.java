package Filehandlingexample;

import java.io.File;

public class Example1 {
	public static void main(String[] args) {
		File newfolder = new File("C:\\Users\\Roshan Jha\\eclipse-workspace\\Skillmine\\src\\ notes\\javanotes");
		 if(!(newfolder.exists())) {
		newfolder.mkdir();
		System.out.println("The folder is created");
	}
		 else
		 {
			 System.out.println("The folder already exist");
		 }
		 }

}
