package TestngDisscussion;

import org.testng.annotations.Test;

public class DependsOn {
	
	@Test(priority=1)
	public void Login()
	{System.out.println("Login First TestCase");
	throw new NullPointerException("hii i threw a janbhujkar wala exception");
		
	}
	
	@Test(priority=2,dependsOnMethods={"Login"})
	public void Home()
	{
		System.out.println("Home page is on 2nd testcase");
	}
	
	@Test(priority=3,dependsOnMethods={"Login","Home"})
	public void Profile()
	{
		System.out.println("Profile is on Test CASE3");
	}
	
	@Test(priority=4)
	public void Logout()
	{
		System.out.println("LogOut the test case");
		
	}
	
	
	

}
