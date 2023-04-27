package lib;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Resolve1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ChromeOptions options = new ChromeOptions();
			    options.addArguments("--remote-allow-origins=*");
			    // Instantiate a ChromeDriver class.  
		        WebDriver driver = new ChromeDriver(options);
		        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		        driver.manage().window().maximize();

		        String baseUrl=("https://rahulshettyacademy.com/seleniumPractise/#/");
		        driver.get(baseUrl);
		        WebElement Dropdown = driver.findElement(By.xpath("//a[@class='cart-header-navlink']"));
		        Dropdown.click();
//		        driver.getWindowHandle();
		        Thread.sleep(5000);
		        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		           //switch to new tab
		           driver.switchTo().window(newTb.get(1));
		        WebElement Dropdown1 = driver.findElement(By.xpath("//span[text()='Veg/fruit name']"));
		        Dropdown1.click();
		         driver.switchTo().window(newTb.get(0));
//		        WebElement Dropdown2 = driver.findElement(By.className("cart-header-navlink"));
//		        Dropdown2.click();
         
		        System.out.println("Mission passed");
		    
	}

}
