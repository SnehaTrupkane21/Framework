package DemoPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D {
  public static void main(String[] args) {
	

	WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
	driver.get("https://demoqa.com/forms");
	driver.findElement(By.xpath("(//span[@class='group-header'])[1]")).click();
	driver.findElement(By.xpath("(//*[@class='group-header'])[2]")).click();

driver.findElement(By.xpath("(//*[text()='Practice Form'])[2]")).click();
//driver.findElement(By.xpath("//*[text()='Add']")).click();

}
}