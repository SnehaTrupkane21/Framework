package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUoProgram2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		   driver.findElement(By.xpath("//input[@name='confirmation']")).click();

String TextPopUp=		driver.switchTo().alert().getText();
	System.out.println( TextPopUp);
	Thread.sleep(2000);
	
	driver.switchTo().alert().dismiss();
	}

}
