package TestngD;

import org.testng.annotations.Test;

public class Dependson {
	@Test
	public void login()
	{
		System.out.println("login the page");
		throw new NullPointerException("This is Exception");
	}
	@Test(dependsOnMethods="login")
	public void home()
	{
		System.out.println("This is home page");
		
		
	}
	@Test(dependsOnMethods= {"login","home"})
	public void profile()
	{
		System.out.println("This is profile");
		
	}

	@Test
	public void Logout()
	{
		System.out.println("Logout the account");
		
	}
}
