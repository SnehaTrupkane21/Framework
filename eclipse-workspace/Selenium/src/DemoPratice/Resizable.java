package DemoPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com");
	WebElement resize1=driver.findElement(By.xpath("//*[text()='Resizable']"));
	resize1.click();
	WebElement iframe=driver.findElement(By.xpath("class=\"demo-frame"));
	driver.switchTo().frame(iframe);
	WebElement resize=driver.findElement(By.xpath("//*[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));	
	
	Thread.sleep(2000);
     Actions act=new Actions(driver);
     act.clickAndHold(resize).moveByOffset(0, 800).release(resize).build().perform();

}
}
