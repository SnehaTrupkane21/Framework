package TestngD;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALL {
public static void main(String[] args) {
	

	WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.spicejet.com");
 WebElement from=driver.findElement(By.xpath("//*[text()='From']"));
 from.click();
 java.util.List<WebElement> allcities=driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73']"));
	
 for(WebElement city:allcities)
 {
	  String name=city.getText();
	  System.out.println(name);
	 
 }
 WebElement to=driver.findElement(By.xpath("//*[text()='To']"));
 to.click();
 java.util.List<WebElement> allCities=driver.findElements(By.xpath("//*[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73']"));
 
 for(WebElement City:allCities)
 {
	 String nameall=City.getText();
	 System.out.println("nameoftocity"+nameall);
 }
 
 
 
 
}	







}


