package Pratice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class B {
	
	public static void main(String[]args) throws IOException
	{
	   WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.javaTpoint.com");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	String path="C:\\Users\\USER\\Pictures\\Screenshots\\abhshxf.jpg";
	File file=new File(path);
	FileHandler.copy(source,file);



	




	}

}
