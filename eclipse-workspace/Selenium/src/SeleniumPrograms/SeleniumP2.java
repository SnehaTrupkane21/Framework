package SeleniumPrograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SeleniumP2 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
	driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Samsung A54");


		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String path="C:\\All Files Programs and notes\\All Files\\Screenshots\\Flipkartpage.jpg";
		File file=new File(path);
		FileHandler.copy(source, file);
		
		
	}

}
