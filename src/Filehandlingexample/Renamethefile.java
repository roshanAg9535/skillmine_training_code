package Filehandlingexample;

import java.io.File;

public class Renamethefile {
	public static void main(String[] args) {
		try {
			File oldname = new File("C:\\\\\\\\Users\\\\\\\\Roshan Jha\\\\\\\\eclipse-workspace\\\\\\\\Skillmine\\\\\\\\src\\\\\\\\ notes\\\\\\\\filehandlingnotes.text");
			File newname = new File("C:\\\\\\\\Users\\\\\\\\Roshan Jha\\\\\\\\eclipse-workspace\\\\\\\\Skillmine\\\\\\\\src\\\\\\\\ notes\\\\\\\\handlingnotes.text");
			boolean result = oldname.renameTo(newname);
			if(result)
			{
				System.out.println("The file name renamed");
			}
			else
			{
				System.out.println("The file name not renamed");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Something went wrong");
		}
	}

}
