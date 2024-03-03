package Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class A {
	public static void main(String[] args) {
		
		
		
		WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
			driver.get("https://www.facebook.com/signup");
			Actions act=new Actions(driver);
	driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Sneha");
	act.sendKeys(Keys.TAB).sendKeys("Trupkane").sendKeys(Keys.TAB).sendKeys("Sneha.trupkane018@gmail.com").sendKeys(Keys.TAB).sendKeys("Sneha.trupkane018@gmail.com").sendKeys(Keys.TAB).sendKeys("Sneha@21").sendKeys(Keys.TAB).sendKeys("21").sendKeys(Keys.TAB).sendKeys("August").sendKeys(Keys.TAB).
	build().perform();
	
	WebElement day=driver.findElement(By.xpath("//select[@title='Day']"));
	Select sel=new Select(day);
	sel.selectByVisibleText("21");
	WebElement month=driver.findElement(By.xpath("//*[@id='month']"));
	Select sel2=new Select(month);
	sel2.selectByValue("8");
	
	WebElement year=driver.findElement(By.xpath("//*[@id='year']"));
	Select sel3=new Select(year);
	sel3.selectByValue("1998");
	
	
	
	
	
	
	
	
	
	
	}

}
