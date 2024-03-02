package PraticePrograms;

import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetTextInsideField {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.facebook.com/signup");
		WebElement firstname=driver.findElement(By.xpath("//*[@name='firstname']"));
		firstname.sendKeys("Sneha");
		String text=firstname.getAttribute("value");
		assertEquals(text, "smita");
		System.out.println(text);
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
	}

}
