package PomPagePratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPagePom {
	WebDriver driver;
	By firstname  = By.xpath("//*[@id='firstName']");


	@FindBy(xpath="//*[text()='Register']")
	WebElement RegisterB;
	@FindBy(xpath="//*[@id='lastName']")
	WebElement lastname;
	@FindBy(xpath="//*[@id='userEmail']")
	WebElement userEmail;
	@FindBy(xpath="//*[@id='userMobile']")
	WebElement usermobile;
	@FindBy(xpath="//form//select")
	WebElement occupationDropdown;
	@FindBy(xpath="//*[@value='Female']")
	WebElement radiobutton;
	@FindBy(xpath="//*[@id='userPassword']")
	WebElement userpassward;
	@FindBy(xpath="//*[@id='confirmPassword']")
	WebElement confirmpassward;
	@FindBy(xpath="//*[@type='checkbox']")
	WebElement type;
	@FindBy(xpath="//*[@id='login']")
	WebElement registerlogin;
	@FindBy(xpath="//*[text()='Login']")
	WebElement finallogin;
	
	
	public RegisterPagePom(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void clickbutton()
	{
		
		RegisterB.click();	
		
	}
	
	public void EnterRegisterDetails()
	{
WebElement name = driver.findElement(firstname);
		
		name.sendKeys("dgfjd");
		lastname.sendKeys("DEFGH");
		userEmail.sendKeys("jghgfgdfs@gmail.com");
		usermobile.sendKeys("7886666664");
		Select sel=new Select(occupationDropdown);
		sel.selectByVisibleText("Engineer");
		radiobutton.click();
		type.click();
		userpassward.sendKeys("Test@123");
		confirmpassward.sendKeys("Test@123");
		registerlogin.click();
		
		
		
		
}
	
	public void loginButtonClick()
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		finallogin.click();
	}
	

}
