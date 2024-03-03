package SeleniumPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Handling {
	public static void main(String[] args) throws IOException {
		
      String path="C:\\All Files Programs and notes\\All Files\\Screenshots\\UserName&Passward.xlsx";
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook ws=new XSSFWorkbook(fis);
		XSSFSheet xs=ws.getSheetAt(0);
		String value=xs.getRow(5).getCell(1).getStringCellValue();
		System.out.println(value);
		
		
		
		
		
		
		
		
		
		
	}

}
