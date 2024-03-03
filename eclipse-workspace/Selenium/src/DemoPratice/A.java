package DemoPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
//	   driver.manage().window().maximize();
//	   driver.get("https://demoqa.com/forms");
//	driver.findElement(By.xpath("(//span[@class='group-header'])[1]")).click();
//	driver.findElement(By.xpath("//*[text()='Text Box']")).click();
//	//driver.findElement(By.xpath(("//*[text()='Check Box']")).click();
	driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("Sneha");
	
	driver.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("sneha.trupkane018@gmail.com");
	
	
	driver.findElement(By.xpath("//*[@id='currentAddress']")).sendKeys("Ganesh nagar boragon meghe ward number 4 wardha");
	driver.findElement(By.xpath("//*[@id='permanentAddress']")).sendKeys("Ganesh nagar boragon meghe ward number 4 wardha");
	
	WebElement sumbit=driver.findElement(By.xpath("//*[@id='submit']"));
	
	sumbit.click();
	
	
	
	
	
	}

}
