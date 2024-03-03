package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AsssertProgram {
	@Test
	public void TestCase1()

	{
		String expected="abc";
		String actual="aBc";
	  SoftAssert sa=new SoftAssert();
	  sa.assertEquals(actual, expected);
	  WebDriver driver=new ChromeDriver();
	 
	  driver.get("https://www.amazon.in");
	  driver.navigate().refresh();
	  String TitleOfPage=driver.getTitle();
	  System.out.println(TitleOfPage);
	  
	  
	  boolean isContains=TitleOfPage.contains("Shopping");
	  sa.assertEquals(isContains, true);
	  System.out.println("Hii, I am Sneha");
	 
	  sa.assertAll();
	
	
	}
	@Test
	public void TestCase2()
	{
		boolean a=true;
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(a);
	System.out.println("This is online WebSite");
		sa.assertAll();
		
	}
	
	
	
	
	
}
