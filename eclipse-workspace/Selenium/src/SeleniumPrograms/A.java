package SeleniumPrograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class A {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.get("https://www.javaTpoint.com");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Source=ts.getScreenshotAs(OutputType.FILE);
		String path="C:\\All Files Programs and notes\\All Files\\Screenshots\\javaTpoint.jpg";
		File file=new File(path);
		FileHandler.copy(Source, file);
		
		
		
		
	}

}
