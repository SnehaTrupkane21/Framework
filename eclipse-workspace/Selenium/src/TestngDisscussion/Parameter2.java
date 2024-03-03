package TestngDisscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter2 {
	
	@Parameters({"server"})
	@Test
	public void p1(String NameOfBrowser)
	{
		System.out.println(NameOfBrowser);
		
	}
	@Parameters({"server","Broswer"})
	@Test
	public void p2(String  serverValue,String NameOfBrowser)
	{
		System.out.println( serverValue);
	
	
	if(NameOfBrowser.equals("Chrome"))
	{
		
	WebDriver driver=new ChromeDriver();
	}
	else
	{
		WebDriver driver=new FirefoxDriver();
		
	}
	
	
	}
	
	
	

}
