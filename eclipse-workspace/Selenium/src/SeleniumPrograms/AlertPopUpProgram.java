package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpProgram {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
	
	   driver.findElement(By.xpath("//input[@name='toPlaceName']")).click();
	   
	 String textOnPop= driver.switchTo().alert().getText();
	System.out.println(textOnPop);
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	
	}

}
