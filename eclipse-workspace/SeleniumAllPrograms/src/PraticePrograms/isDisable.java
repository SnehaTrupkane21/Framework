package PraticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisable {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:www.facebook.com/signup");
		WebElement singnButton=driver.findElement(By.xpath("//*[@name='websubmit']"));
		boolean isdisplay=singnButton.isDisplayed();
		System.out.println(isdisplay);
	}

}
