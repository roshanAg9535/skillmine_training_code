package Filehandlingexample;

import java.io.File;

public class Deletethefile {
	public static void main(String[] args) {
		try {
		File f = new File("C:\\Users\\Roshan Jha\\eclipse-workspace\\Skillmine\\src\\notes\\handlingnotes.text");
		if(f.exists())
		{
			if(f.delete()==true)
			{
				System.out.println("The file is deleted");
			}
			else
			{
				System.out.println("The file is not deleted");
			}
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Something went wrong");
		}
	}

}
