package lib;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    // Instantiate a ChromeDriver class.  
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        // Open URL
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
 
        // Enter Firstname
        driver.findElement(By.name("firstname")).click();
        driver.findElement(By.name("firstname")).sendKeys("Tom");
        // Set Lastname
        driver.findElement(By.name("lastname")).click();
        driver.findElement(By.name("lastname")).sendKeys("Wood");
        // Select Gender
        driver.findElement(By.id("sex-0")).click();
        // Select Experience
        driver.findElement(By.id("exp-4")).click();
        // Enter Date
        driver.findElement(By.id("//input[@id='datepicker']")).click();
        driver.findElement(By.id("//input[@id='datepicker']")).sendKeys("16-10-2020");
        // Select Profession
        driver.findElement(By.id("profession-1")).click();
        // Select Automation Tool
        driver.findElement(By.id("tool-2")).click();

        // Select Continent
        driver.findElement(By.id("continents")).click();
        WebElement dropdown = driver.findElement(By.id("continents"));
        dropdown.findElement(By.xpath("//option[. = 'Europe']")).click();

        // Select Command
        WebElement dropdown1 = driver.findElement(By.id("selenium_commands"));
        dropdown1.findElement(By.xpath("//option[. = 'Browser Commands']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll Vertical
        js.executeScript("window.scrollTo(0,675.5555419921875)");

        // Click Submit
        driver.findElement(By.id("submit")).click();
	}

}
