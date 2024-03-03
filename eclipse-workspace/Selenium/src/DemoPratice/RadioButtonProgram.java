package DemoPratice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonProgram {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://demoqa.com/forms");
		
				
	driver.findElement(By.xpath("(//span[@class='group-header'])[1]")).click();
	/*driver.findElement(By.xpath("//*[text()='Check Box']")).click();
	driver.findElement(By.xpath("//*[@class='rct-checkbox']")).click();*/
	WebElement button=driver.findElement(By.xpath("(//*[text()='Radio Button'])"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].click();", button);
	WebElement radiobuttun=driver.findElement(By.xpath("//*[@id='yesRadio']"));
	JavascriptExecutor js1 = (JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].click();", radiobuttun);


	
	
	
	}
}
