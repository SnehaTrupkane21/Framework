package SeleniumPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ramehs {
	
	
	public static void main(String[] args) throws IOException {
		String path="C:\\All Files Programs and notes\\All Files\\Screenshots\\Book2.xlsx";
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh1=wb.getSheetAt(0);
		int totalCountRow=sh1.getLastRowNum();
		System.out.println("Row Number :"+totalCountRow);
		int actualCountRow=totalCountRow+1;
		System.out.println("actualCountRoW :"+actualCountRow);
	
		int totalcolumn=sh1.getRow(0).getLastCellNum();
		System.out.println("totalcolumn"+totalcolumn);
		
		
		
		
		
	}

}
