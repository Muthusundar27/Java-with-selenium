package lib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Resolve {
	
	 

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    // Instantiate a ChromeDriver class.  
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String baseUrl = "https://rahulshettyacademy.com/seleniumPractise/#/offers";
        driver.get(baseUrl);  
        WebElement Dropdown = driver.findElement(By.xpath("//*[@class='sort-icon sort-descending']"));

        Dropdown.click();
        
        
        WebElement Dropdown1 = driver.findElement(By.xpath("span[class='sort-icon sort-ascending']"));
        
        Dropdown1.click();
    
        
	}

}
