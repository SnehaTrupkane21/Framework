package DependsOnMethodsPrograms;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class P1 {
	WebDriver driver;
@Test(priority=1)
public void login() {
	
	System.out.println("login");
	
	driver.manage().window().maximize();
	driver.get("https://www.Facebook.com");
	throw new NullPointerException("hii");
	
}
@Test(priority=2,dependsOnMethods={"login"})
public void Profile()
{
System.out.println("Profile");	
}
@Test(priority=3,dependsOnMethods= {"login","Profile"})
public void Home()
{
System.out.println("Home");	
}
@Test(priority=4)
public void Logout()
{
System.out.println("Logout");	
}
}
