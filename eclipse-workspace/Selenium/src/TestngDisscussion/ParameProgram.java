package TestngDisscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameProgram {
	@Parameters("server")
	@Test
	public void getBroswerName(String Browsername)
	{
		System.out.println("The name of the broswer is:" +Browsername);
		
	}
	@Parameters({"server","Browser"})
	@Test
	public void getServerAndBrowserName(String Server,String Broswer)
	{
		
		System.out.println("The value of the server:"+Broswer);
	if(Broswer.equals("Chrome"))
	{
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 
			
        
	}
	else
	{
		WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.facebook.in");
		 
		
	}
	}
	
	
	
	
	

}
