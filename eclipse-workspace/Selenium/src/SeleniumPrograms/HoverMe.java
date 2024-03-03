package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverMe {

public static void main(String[] args) {
	
WebDriver driver=new ChromeDriver();


driver.manage().window().maximize();
driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

WebElement HoverME=driver.findElement(By.xpath("//button[@id='sub-menu']"));
HoverME.click();
Actions act=new Actions(driver);
act.moveToElement(HoverME).perform();
WebElement GoogleClick=driver.findElement(By.xpath("//a[text()='Google']"));
GoogleClick.click();
WebElement Search=
driver.findElement(By.xpath("//*[@id='APjFqb']"));
   Search.sendKeys("javaTpoint");
 
}
}