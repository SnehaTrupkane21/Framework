package TestPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PomPagePratice.RegisterPagePom;

public class RegisterTest extends BaseTest {

	WebDriver driver;
	@Test(priority=1)
	public void RegisterToApp()
	{
		

		register.clickbutton();
		 register.EnterRegisterDetails();
		 
	}
	
@Test(priority=2)
public void navLoginPage()
{
 register.loginButtonClick();	

}
	
	
	
	
	
	
	
}
