package SeleniumPrograms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniump7 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.facebook.com");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Sneha");
		SeleniumP6 ab=new SeleniumP6();
		 ab.program(driver, "Facebookpage");
		
		
	}
	

}
