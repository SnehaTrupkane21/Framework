package TestngDisscussion;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPage {
	@BeforeClass
	public void LoginPage()
	{
		System.out.println("LoginPage");
	}
	@Test
	public void getText()
	{
		System.out.println("GetText");
		
	}

}
