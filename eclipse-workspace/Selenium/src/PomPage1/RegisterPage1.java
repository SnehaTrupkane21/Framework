package PomPage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.FindBy;

public class RegisterPage1 {
	
		WebDriver driver;
		
		@FindBy(xpath="//*[@id='firstName']")
					WebElement firstname;
		@FindBy
			(xpath="//*[@name='lastname']")
		
		 WebElement LN;
		@FindBy
			(xpath="//*[text()='Mobile number or email address']")
		
		 WebElement email;
		@FindBy
			(xpath="//*[@id='password_field']")
		
		  WebElement passwd;
		@FindBy
			(xpath="//select[@id='day']")
		
		 WebElement Day;
		@FindBy
			(xpath="//select[@id='month']")
		
		 WebElement Month;
		@FindBy
			(xpath="//select[@id='year']")
		
		WebElement Year;
		@FindBy
			(xpath="//*[@name='websubmit']")
		
		 WebElement SingnUp;
		
		
		public RegisterPage1(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements( driver,this);
			
		}
		
		public void  enterCredential(String emailValue)
		{
			 firstname.sendKeys("Skaks");
			LN.sendKeys("ajdsg");
			email.sendKeys("sdksd@gmail.com");
			passwd.sendKeys(emailValue);
			Select day=new Select(Day);
			day.selectByVisibleText("21");
			Select month=new Select(Month);
			month.selectByVisibleText("August");
			Select year=new Select(Year);
			year.selectByVisibleText("1998");
			
			
		}
		

}
