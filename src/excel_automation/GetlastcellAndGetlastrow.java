package excel_automation;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetlastcellAndGetlastrow {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Roshan Jha\\eclipse-workspace\\Skillmine\\excel sheet\\skillminedata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row r = sh.getRow(0);
		int colNum = r.getLastCellNum();
		System.out.println("The last cell in the excel is "+colNum);
		int rownum = sh.getLastRowNum()+1;
		System.out.println("The last row in the excel is "+rownum);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
