package SeleniumPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {
	public static void main(String[] args) throws IOException  {
		
		String path="C:\\All Files Programs and notes\\All Files\\Screenshots\\Book1.xlsx";
        File file=new File(path);
        FileInputStream fis=new FileInputStream(file);
        XSSFWorkbook ws=new XSSFWorkbook(fis);
        XSSFSheet sh1=ws.getSheetAt(0);
        File fount=new File(path);
        FileOutputStream fos=new FileOutputStream(fount);
        sh1.getRow(5).getCell(1).setCellValue("write a data");
        sh1.getRow(7).createCell(6).setCellValue("Write a new data");
        sh1.createRow(12).createCell(0).setCellValue("HII iam sneha");
        ws.write(fos);
	
	
	
	}
	
	
	

}
