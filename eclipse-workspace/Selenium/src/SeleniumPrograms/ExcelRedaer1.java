package SeleniumPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRedaer1 {
	public static void main(String[] args) throws IOException {
		
		ExcelRedaer1 et=new ExcelRedaer1();
		et.readExcelData(1, 0);
				
		
	}

	public String readdata (int row,int column) throws IOException
	{
		String path="C:\\\\All Files Programs and notes\\\\All Files\\\\Screenshots\\\\Book2.xlsx";		
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh1=wb.getSheetAt(0);
		String value=sh1.getRow(row).getCell(column).getStringCellValue();
		System.out.println(value);
		return value;
		
		
		
	}
	
	public String readExcelData(int row,int column) throws IOException
	{
		
		String path="C:\\All Files Programs and notes\\All Files\\Screenshots\\Book2.xlsx";
				File file=new File(path);
				FileInputStream fis=new FileInputStream(file);
				XSSFWorkbook wb=new XSSFWorkbook(fis);
				XSSFSheet sh1=wb.getSheetAt(0);
				DataFormatter df=new DataFormatter();
				String data=df.formatCellValue(sh1.getRow(row).getCell(column));
				System.out.println(data);
				
				
	
		
		return data;
		
		
	}
	

	}
