package SeleniumPrograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class SeleniumP6 {
	public void program(WebDriver driver, String filename) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"//Screenshot"+filename+".jpg";
		File file=new File(path);
		FileHandler.copy(source, file);
		
		
		
	}

}
