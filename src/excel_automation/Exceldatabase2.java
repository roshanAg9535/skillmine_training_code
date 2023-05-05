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

public class Exceldatabase2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		//connect to database
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/skillmine","root","root");
		PreparedStatement ps = conn.prepareStatement("create table if not exists new_details(id int(45) primary key auto_increment,first_name varchar(100),last_name varchar(100),email varchar(100),gender varchar(100),ip_address varchar(100))");
		ps.executeUpdate();
		FileInputStream fs = new FileInputStream ("C:\\Users\\Roshan Jha\\eclipse-workspace\\Skillmine\\excel sheet\\New_details.xlsx");
		Workbook wb = new XSSFWorkbook(fs);
		Sheet sh = wb.getSheetAt(0);
		int rownumber = sh.getLastRowNum();
		for(int i =1;i<=rownumber;i++)
		{
			Row r = sh.getRow(i);
			String first_name = r.getCell(0).getStringCellValue();
			String last_name = r.getCell(1).getStringCellValue();
			String email = r.getCell(2).getStringCellValue();
			String gender = r.getCell(3).getStringCellValue();
			String ip_address = r.getCell(4).getStringCellValue();
			
			PreparedStatement ps1 = conn.prepareStatement("insert into new_details(first_name,last_name,email,gender,ip_address)values('"+first_name+"','"+last_name+"','"+email+"','"+gender+"','"+ip_address+"')");
			ps1.executeUpdate();
		}
		wb.close();
		fs.close();
		conn.close();
		System.out.println("Data successfully inserted");
	
		}
		
	}


