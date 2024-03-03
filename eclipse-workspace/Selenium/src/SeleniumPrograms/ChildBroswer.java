package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBroswer {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();


		driver.manage().window().maximize();
		driver.get("https://www.groww.in/");
		driver.findElement(By.xpath("//span[text()='Login/Register']")).click();
		driver.findElement(By.xpath("//input[@id='login_email1']")).sendKeys("Sneha.trupkane018@gmail.com");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
	    
	
	
	}

}
