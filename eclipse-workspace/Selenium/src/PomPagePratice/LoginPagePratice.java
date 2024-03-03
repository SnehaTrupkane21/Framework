package PomPagePratice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePratice {
	
 WebDriver driver;

 @FindBy(xpath="//*[@id='userEmail']")
 WebElement username;
 @FindBy(xpath="//*[@id='userPassword']")
 WebElement passward;
 @FindBy(xpath="//*[@id='login']")
 WebElement login;
 
 public LoginPagePratice(WebDriver driver)
 {
	 
	 this.driver=driver;
	 
	 PageFactory.initElements(driver, this);
	 
 }
 
 public void EnterCredentail()
 {
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

	 
	 username.sendKeys("jghgfgdfs@gmail.com");
	 passward.sendKeys("Test@123");
	 
	 
	 
 }
 
 public void loginbutton ()
 {
	 
	 login.click();
 }
 
 
 
 
 


}
