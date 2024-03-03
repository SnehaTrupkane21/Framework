package SeleniumPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static void main(String[] args) throws IOException {
		
		String path="C:\\All Files Programs and notes\\All Files\\Screenshots\\Book2.xlsx";
		
		
		
		File file=new File(path);
		
		FileInputStream fis=new FileInputStream(file);
	
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sh1=wb.getSheetAt(0);
		
		String value=sh1.getRow(8).getCell(0).getStringCellValue();
		
		System.out.println( value);
		
		
		
		}



}
