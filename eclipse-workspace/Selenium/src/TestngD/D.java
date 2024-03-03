package TestngD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        // Click on the date of birth input field to open the date picker
        WebElement dateOfBirthInput = driver.findElement(By.xpath("//*[@id='dateOfBirthInput']"));
        dateOfBirthInput.click();

        // Select '01' from the 'Day' dropdown
        WebElement dayElement = driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--001']"));
        dayElement.click();

        // Select 'May' from the 'Month' dropdown
        WebElement monthElement = driver.findElement(By.xpath("//div[@class='react-datepicker__month-select']/select"));
        new Actions(driver).moveToElement(monthElement).click().perform();
        WebElement mayOption = driver.findElement(By.xpath("//div[@class='react-datepicker__month-option' and text()='May']"));
        mayOption.click();

        // Select '1990' from the 'Year' dropdown
        WebElement yearElement = driver.findElement(By.xpath("//div[@class='react-datepicker__year-select']/select"));
        new Actions(driver).moveToElement(yearElement).click().perform();
        WebElement yearOption = driver.findElement(By.xpath("//div[@class='react-datepicker__year-option' and text()='1990']"));
        yearOption.click();

        // Close the browser
        driver.quit();
    }
}
