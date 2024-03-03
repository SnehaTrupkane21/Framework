package DemoPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxExample {
	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demoqa.com/forms");
		driver.findElement(By.xpath("(//span[@class='group-header'])[1]")).click();
		driver.findElement(By.xpath("//*[text()='Text Box']")).click();
		//driver.findElement(By.xpath("//*[text()='Check Box']")).click();
		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("Sneha");
		
		driver.findElement(By.xpath("//*[@id='userEmail']")).sendKeys("sneha@gmail.com");
		
		
		driver.findElement(By.xpath("//*[@id='currentAddress']")).sendKeys("wardha");
		driver.findElement(By.xpath("//*[@id='permanentAddress']")).sendKeys("wardha");
		Thread.sleep(2000);
		
		WebElement submit=driver.findElement(By.xpath("//*[@id='submit']"));
JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", submit);


}
}
