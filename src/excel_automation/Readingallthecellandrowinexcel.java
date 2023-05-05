package excel_automation;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readingallthecellandrowinexcel {
	public static void main(String[] args) {
					
					try{
						File f = new File("C:\\Users\\Roshan Jha\\eclipse-workspace\\Skillmine\\excel sheet\\MOCK_DATA.xlsx");
						FileInputStream fis = new FileInputStream(f);
						Workbook wb =  WorkbookFactory.create(fis);
						Sheet sh = wb.getSheetAt(0);
						
						for(Row r : sh){
							{
								for (Cell c : r){
									
									switch(c.getCellType()){
									case Cell.CELL_TYPE_STRING : 
									{
										System.out.print(c.getStringCellValue()+"\t");
										break;
									}
									case Cell.CELL_TYPE_NUMERIC:
									{
										System.out.print(c.getNumericCellValue()+"\t");
										break;
									}
									case Cell.CELL_TYPE_BLANK:
									{
										System.out.print(" --- "+ "\t");
										break;
									}
									default:{
										System.out.print("No value in the excel sheet.");
									}
								}
									System.out.println();
							}
						}
					}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
