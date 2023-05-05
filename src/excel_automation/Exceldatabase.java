package excel_automation;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldatabase {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		//connect to database
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/skillmine","root","root");
		PreparedStatement ps = conn.prepareStatement("create table if not exists student_details(id int(45) primary key auto_increment,name varchar(100),address varchar(100))");
		ps.executeUpdate();
		FileInputStream fs = new FileInputStream ("C:\\Users\\Roshan Jha\\eclipse-workspace\\Skillmine\\excel sheet\\student_details.xlsx");
		Workbook wb = new XSSFWorkbook(fs);
		Sheet sh = wb.getSheetAt(0);
		int rownumber = sh.getLastRowNum();
		for(int i =1;i<=rownumber;i++)
		{
			Row r = sh.getRow(i);
			String name = r.getCell(0).getStringCellValue();
			String address = r.getCell(1).getStringCellValue();
			PreparedStatement ps1 = conn.prepareStatement("insert into student_details(name,address)values('"+name+"','"+address+"')");
			ps1.executeUpdate();
			ps1.execute("commit");
		}
		wb.close();
		fs.close();
		conn.close();
		System.out.println("Data successfully inserted");
	
		}
		
	}


