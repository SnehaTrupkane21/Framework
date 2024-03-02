package PraticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.facebook.com/signup");
		WebElement firstname=driver.findElement(By.xpath("//*[@name='firstname']"));
	boolean isenable=	firstname.isEnabled();
		System.out.println(isenable);
		
	}

}
