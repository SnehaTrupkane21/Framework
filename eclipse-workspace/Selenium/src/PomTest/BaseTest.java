package PomTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import PomPage.LoginPage;
import PomPage.RegisterPage;


public class BaseTest {
	
	
		RegisterPage registerpage;
		LoginPage loginPage;
		
		static WebDriver driver;
		
		@BeforeSuite
		public void browser()
		{
			
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://rahulshettyacademy.com/client");
		}
		
		@BeforeClass
		public void CreateObject()
		{
		registerpage=new RegisterPage(driver);
		loginPage=new LoginPage(driver);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}



