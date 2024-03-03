package TestngDisscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tes3tCaseAmazon {
	WebDriver driver;
	@Test(priority=1)
	public void launchBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.navigate().refresh();
	}
	@Test(priority=2)
	public void searchProduct()
	{
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("mobile");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	
	@Test(priority=3)
	public void ClickOnApple()
	{
		driver.findElement(By.xpath("(//*[text()='Apple'])[1]")).click();
	}
}
