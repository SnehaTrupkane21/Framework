package TestPackage;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	
	
	@Test(priority=1)
	public void LoginToApp()
	{
	
		loginpage.EnterCredentail();;
		loginpage.loginbutton();
		
	}

	
	
	
	
	
	
	
}
