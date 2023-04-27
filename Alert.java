package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
			    // Instantiate a ChromeDriver class.  
		        WebDriver driver = new ChromeDriver(options);
		        driver.manage().window().maximize();
		        
		        String baseURL = "https://demo.guru99.com/test/delete_customer.php";
		        driver.get(baseURL);
		        Thread.sleep(2000);
		        
		        WebElement alert = driver.findElement(By.xpath("//input[@name='cusid']"));
		        alert.click();
		        alert.sendKeys("2712");
		        driver.findElement(By.xpath("//input[@name='submit']")).click();
		        driver.switchTo().alert().accept();
		        Thread.sleep(2000);	
		        driver.switchTo().alert().accept();

	}

}
