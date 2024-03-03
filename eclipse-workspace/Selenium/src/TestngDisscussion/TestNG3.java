package TestngDisscussion;

import org.testng.annotations.Test;

public class TestNG3 {
	
	private static final String priority = null;
	@Test(priority=4)
	public void login()
	{
		System.out.println("hii i am login");
	}
	@Test(priority=2)
	public void logout()
	{
		System.out.println("hii i am logout");
	}
	
	@Test(priority=4)
	public void application()
	{
		System.out.println("hii enter in appplication");
	}
   @Test(priority =1)
   public void zero()
   {
	   System.out.println("i am zero");
   }
}
