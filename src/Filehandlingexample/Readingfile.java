package Filehandlingexample;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Readingfile {
	public static void main(String[] args) throws FileNotFoundException {
//		try {
//		File newfolder = new File("C:\\Users\\Roshan Jha\\eclipse-workspace\\Skillmine\\src\\ notes\\filehandlingnotes.text");
//		//reading using scanner class
//		Scanner sc = new Scanner(newfolder);
//		while(sc.hasNextLine())
//		{
//			String lines = sc.nextLine();
//			System.out.println(lines);
//		}
//		sc.close();
//		}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//			System.out.println("File is not able to read");
//		}
//	try
//	{
//		File newfolder = new File("C:\\Users\\Roshan Jha\\eclipse-workspace\\Skillmine\\src\\ notes\\filehandlingnotes.text");
//		//make the object of reader class
//		FileReader f = new FileReader(newfolder);
//		//create the char array
//		char ch[] = new char[1000];
//		f.read(ch);
//		System.out.println(ch);
//		f.close();
//		
//	}
//	catch(Exception e)
//	{
//		e.printStackTrace();
//		System.out.println("File not written");
//	}
		//reading till the end of the file
		int num;  FileReader fr = null;
		try
		{
			fr = new FileReader("C:\\\\Users\\\\Roshan Jha\\\\eclipse-workspace\\\\Skillmine\\\\src\\\\ notes\\\\filehandlingnotes.text");
			while((num=fr.read())!=-1)
			{
			  System.out.print((char)num);
			}
			fr.close();
		}

		catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("File not written");
		}
	}
	

}
