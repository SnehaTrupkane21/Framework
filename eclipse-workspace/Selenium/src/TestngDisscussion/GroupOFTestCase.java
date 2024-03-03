package TestngDisscussion;

import org.testng.annotations.Test;

public class GroupOFTestCase {
	
	@Test(groups= {"Sanity"})
	public void Login()
	{
	System.out.println("Login your account");	
	}
  @Test(groups= {"functional"})
  public void Home()
  {
	  System.out.println("Home page is there");
  }
  @Test(groups= {"Regression"})
  public void Profile()
  {
	  System.out.println("Profile is there");
  }
  @Test(groups= {"Adhoc"})
  public void Logout()
  {
	  System.out.println("Logout the login page");
  }
}
