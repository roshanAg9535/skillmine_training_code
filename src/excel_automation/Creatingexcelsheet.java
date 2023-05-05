package excel_automation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Creatingexcelsheet {
	public static void main(String[] args) throws FileNotFoundException {
		//creating an instance of workbook class
		Workbook wb = new XSSFWorkbook();
		//create an excel file at the specified location
		OutputStream fileout = new FileOutputStream("C:\\Users\\Roshan Jha\\eclipse-workspace\\Skillmine\\excel sheet\\skillminedata.xlsx");
		System.out.println("Excel file has been created succesfully");
		
	}

}
