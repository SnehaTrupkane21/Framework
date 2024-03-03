package DemoPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://demoqa.com/forms");
	driver.findElement(By.xpath("(//span[@class='group-header'])[1]")).click();

WebElement webTable=driver.findElement(By.xpath("//*[text()='Web Tables']"));
JavascriptExecutor js = (JavascriptExecutor)driver;

js.executeScript("arguments[0].click();", webTable);

}
}
