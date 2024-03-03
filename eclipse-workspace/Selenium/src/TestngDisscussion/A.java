package TestngDisscussion;

import org.testng.annotations.Test;

public class A {
	
		
		@Test(priority=1 )
		public void login()
		{
			System.out.println("Login Test Case");
			throw new NullPointerException("Failing Test Case");
		}
	    
		@Test(priority=2 , dependsOnMethods={"login"} )
		public void home()
		{
			System.out.println("Home Test Case");
		}
		
		@Test(priority=3 , dependsOnMethods={"login" , "home"} )
		public void profile()
		{
			System.out.println("Profile Test Case");
		}
		
		@Test(priority=4)
		public void logout()
		{
			System.out.println("Logout Test Case");
		}
	}

