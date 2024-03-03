package TestngD;

import org.testng.annotations.Test;

public class Dependsclass {
	@Test
	public void logout()
	{
		System.out.println("This logout the account");
		
	}
@Test(dependsOnMethods= {"TestngD.Dependson.profile"})
public void Profile()
{
	System.out.println("This is depends on methods of profile class 2");
	}
}
