package TestngDisscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void m1(@Optional("chrome")String browser)
	{
	
		if(browser.equalsIgnoreCase("Chrome"))
		{	
			driver=new ChromeDriver();
	}	
		else if(browser.equalsIgnoreCase("firefox"))
		{	
			driver=new FirefoxDriver();
			
	}
		driver.get("https:www.facebook.com");
		 String value=driver.getTitle();
		System.out.println(value);
		
	}

}
