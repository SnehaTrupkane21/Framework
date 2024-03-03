package SeleniumPrograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SeleniumProgram4 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.navigate().refresh();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Source=ts.getScreenshotAs(OutputType.FILE);
		//String path="C:\\All Files Programs and notes\\All Files\\Screenshots\\amzon.jpg";
		String path=System.getProperty("user.dir")+"//Screenshot//amazonscreenshot.jpg";
     File file=new File(path);
     FileHandler.copy(Source, file);
     
	
	}

}
