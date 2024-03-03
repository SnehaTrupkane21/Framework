package SeleniumPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Rows {
	public static void main(String[] args) throws IOException {
		
		String path="C:\\All Files Programs and notes\\All Files\\Screenshots\\Book2.xlsx";

		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		
	 XSSFWorkbook xs=new XSSFWorkbook(fis);
	 
	 XSSFSheet sh1=xs.getSheetAt(0);
	 DataFormatter df=new DataFormatter();
	int Row=sh1.getLastRowNum()+1;
	int column =sh1.getRow(0).getLastCellNum();
	for(int i=0;i<Row;i++)
	{
		for(int j=0;j<column;j++)
		{
			String value=df.formatCellValue(sh1.getRow(i).getCell(j));
			System.out.println(value);
			
		}
		
		
	}
	 
		
		
		
		
		
	}

}
