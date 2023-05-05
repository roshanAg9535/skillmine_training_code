package excel_automation;

import java.io.File;
import java.io.IOException;

public class Makincsvfile {
	public static void main(String[] args) throws IOException {
		File f= new File("C:\\Users\\Roshan Jha\\eclipse-workspace\\Skillmine\\excel sheet\\java.csv");
		f.createNewFile();
	}

}
