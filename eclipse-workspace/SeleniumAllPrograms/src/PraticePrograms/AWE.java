package PraticePrograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AWE {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
        TakesScreenshot as=(TakesScreenshot)driver;	
       File source= as.getScreenshotAs(OutputType.FILE);
		String path="C:\\Users\\USER\\Pictures\\Screenshots\\Screenshot\\flipkart.jpeg";
		File file=new File(path);
         FileHandler.copy(source, file);
		
		
		
	}

}
