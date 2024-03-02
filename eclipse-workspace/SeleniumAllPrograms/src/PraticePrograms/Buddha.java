package PraticePrograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Buddha {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freepik.com/free-photo/buddhist-meditates-by-lotus-pond-tranquil-harmony-generative-ai_41074148.htm#query=gautam%20buddha&position=0&from_view=keyword&track=ais&uuid=91ad4c7d-25d0-473c-bb24-0116748ecd3f");
		TakesScreenshot as=(TakesScreenshot)driver;
		File source=as.getScreenshotAs(OutputType.FILE);
		String path="C:\\Users\\USER\\Pictures\\Screenshots\\Screenshot\\buddha.jpeg";
		File file=new File(path);
		FileHandler.copy(source,file);
		
		
		
		
		
		
		
	}

}
