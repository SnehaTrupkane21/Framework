package PomPage1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {

	
		 WebDriver driver;
@FindBy(xpath="//*[@id='email']")
			
  	        WebElement userName;
	@FindBy(xpath="//*[@id='pass']")
   WebElement password;	
  @FindBy(xpath="//*[@name='login']")
   WebElement login;
	
	public LoginPage1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	public void enterDetails()
	{
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		userName.sendKeys("abcdef@gmail.com");
		password.sendKeys("Sneha@21");
		
	}
	public void clickP()
	{
		login.click();
		
	}
	
	
	
	
	
}


