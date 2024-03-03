package PomPage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	
	
	WebDriver driver;
	@FindBy(xpath="(//*[text()='Register'])[1]")
	WebElement register;
	@FindBy(xpath="//*[@id='firstName']")
	WebElement FirstName;
	@FindBy(xpath="//*[@id='lastName']")
	WebElement LastName;
	@FindBy(xpath="//*[@id='userEmail']")
	WebElement UserEmail;
	@FindBy(xpath="//*[@id='userMobile']")
	WebElement UserMobile;
	@FindBy(xpath="/html/body/app-root/app-register/div[1]/section[2]/div/div[2]/form/div[3]/div[1]/select")
	WebElement Occupation;
	@FindBy(xpath="//*[text()='Female']")
	WebElement Female;
	@FindBy(xpath="//*[@id='userPassword']")
	WebElement UserPassword;
	@FindBy(xpath="//*[@id='confirmPassword']")
	WebElement ConfirmPassword;
	@FindBy(xpath="//*[@type='checkbox']")
	WebElement checkbox;
	@FindBy(xpath="//*[@value='Register']")
	WebElement RegisterClick;
	@FindBy(xpath="//*[text()='Login']")
	WebElement loginButton;
	  
	
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void RegisterClick()
	{
		register.click();
		
	}
	public void RegisterDetails()
	{
		FirstName.sendKeys("hhh");
		LastName.sendKeys("jfgsfad");
		 UserEmail.sendKeys("abcdef21@gmail.com");
		 UserMobile.sendKeys("9875645353");
		 Select sec=new Select( Occupation);
		sec.selectByVisibleText("Engineer");
		Female.click();
		UserPassword.sendKeys("sneha@21");
		ConfirmPassword.sendKeys("sneha@21");
		checkbox.click();
		RegisterClick.click();
		
	}	 
		 
	public void LoginClick()
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		loginButton.click();
		
		
		
	}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	


