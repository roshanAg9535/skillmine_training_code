package excel_automation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writinginexecel {
	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet0 = wb.createSheet("Sheet1");
		Row row0 = sheet0.createRow(0);
		Cell cell0 = row0.createCell(0);
		cell0.setCellValue("Welcome");
		File f = new File("C:\\Users\\Roshan Jha\\eclipse-workspace\\Skillmine\\excel sheet\\skillminedata.xlsx");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		fos.close();
		System.out.println("Date is written in excel sheet");
	}

}
