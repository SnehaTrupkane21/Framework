package PomTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	@Test(priority=1) 
	public void Login2()
	{
		loginPage.enterCredentials();
		
		
	}
	
	@Test(priority=2)
	public void Click1()
	{
		loginPage.clickOnlogin();
		
	}
	@Test(priority=3)
	public void TitlePage()
	{
		
		String Title=loginPage.TitleOfPage();
		Assert.assertEquals(Title, "Let's Shop");
		
	}
	
	
	
	
	

}
