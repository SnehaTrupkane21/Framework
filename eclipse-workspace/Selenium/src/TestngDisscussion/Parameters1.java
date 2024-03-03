package TestngDisscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters1 {

	
	@Parameters({"server"})
	@Test 
	public void a(String browsername)
	{
		System.out.println(browsername);
	}
	
	@Parameters({"server","browser"})
	@Test
	public void b(String serverValue,String  browsername)
	{
		System.out.println(serverValue);
	
	if(browsername.equals("Chrome"))
	{
		WebDriver driver=new ChromeDriver();
		
		
	}
	else
	{
		WebDriver driver=new FirefoxDriver();
	}
	
}
}
