package excel_automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcelsheet {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		File f = new File("C:\\Users\\Roshan Jha\\eclipse-workspace\\Skillmine\\excel sheet\\skillminedata.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(f);
		Sheet sh = wb.getSheetAt(0);
		Row r = sh.getRow(0);
		Cell c = r.getCell(0);
		System.out.println(c);
		f1.close();
		//or you can write this also
//		DataFormatter df = new DataFormatter();
//		String print =df.formatCellValue(wb.getSheetAt(0).getRow(0).getCell(0));
//		System.out.println(print);
		
	}

}
