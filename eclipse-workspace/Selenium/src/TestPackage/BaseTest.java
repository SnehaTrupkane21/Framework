package TestPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import PomPage.RegisterPage;
import PomPagePratice.LoginPagePratice;
import PomPagePratice.RegisterPagePom;

public class BaseTest {
	
	LoginPagePratice loginpage;
	RegisterPagePom register;
	
	static WebDriver driver;
	
	@BeforeSuite
	public void initBrowser()
	{
		
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/client");
		
		
	}
	
	@BeforeClass
	public void CreateObject()
	{
		
		loginpage=new LoginPagePratice(driver);
		register=new RegisterPagePom(driver);
		
	}
	 
	@AfterSuite
	public void tearDown()
	{
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		driver.quit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
