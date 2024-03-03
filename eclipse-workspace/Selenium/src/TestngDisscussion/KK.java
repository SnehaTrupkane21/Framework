package TestngDisscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KK {
	WebDriver driver;
	@Test
	public void launchBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void GetTitleBrowser()
	{
	String titleOfPage=	driver.getTitle();
		System.out.println(titleOfPage);
	}
    
}
