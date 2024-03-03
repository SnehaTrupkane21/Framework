package PomPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	@FindBy(xpath="//*[@id='userEmail']")
	WebElement email;
	@FindBy(xpath="//*[@id='userPassword']")
	WebElement password;
	@FindBy(xpath="//*[@id='login']")
	WebElement loginButton;
	 public LoginPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 
	 }
	 
	 public void enterCredentials() {
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 email.sendKeys("abcdef21@gmail.com");
		 password.sendKeys("sneha@21");
		 
	 }
	public void clickOnlogin()
	{
		loginButton.click();
		
	}
	public String TitleOfPage()
	{
		String TitleOfPage=driver.getTitle();
		return TitleOfPage;
	}
	
	
	
	

}
