package PomTest;

import org.testng.annotations.Test;



public class RegisterTest extends BaseTest{
	@Test(priority=2)
	public void login()
	{
	     
		registerpage.LoginClick();
		
	}
	@Test(priority=1)
	public void registerPom()
	{
		registerpage.RegisterClick();
		registerpage.RegisterDetails();
		
		
	

}
}
