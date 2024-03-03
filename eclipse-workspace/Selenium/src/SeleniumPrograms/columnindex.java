package SeleniumPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class columnindex {
	public static void main(String[] args) throws IOException {
		
		String path="C:\\All Files Programs and notes\\All Files\\Screenshots\\Book2.xlsx";
		File file=new File(path);
		
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh1= wb.getSheetAt(0);
		DataFormatter df=new DataFormatter();
		String data=df.formatCellValue(sh1.getRow(10).getCell(1));
		System.out.println(data);
		for(int i=0;i<10;i++)
			
		{
			String value=df.formatCellValue(sh1.getRow(i).getCell(1));
			System.out.println(value);
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
