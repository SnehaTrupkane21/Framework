package TestngDisscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class K2 {
	WebDriver driver;
	@Test 
	public void LaunchBrowser()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void GetText()
	{
	String value=	driver.getTitle();
		System.out.println(value);
	}

}
