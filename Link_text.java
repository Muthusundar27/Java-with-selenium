package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Link_text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ChromeOptions options = new ChromeOptions();
			    options.addArguments("--remote-allow-origins=*");
			    // Instantiate a ChromeDriver class.  
		        WebDriver driver = new ChromeDriver(options);
		        driver.manage().window().maximize();
		  String baseUrl = "http://demo.guru99.com/test/block.html";					
	        		
	  		
	        driver.get(baseUrl);					
	        driver.findElement(By.partialLinkText("Inside")).click();					
	        System.out.println(driver.getTitle());					
	        driver.navigate().back();			
	        driver.findElement(By.partialLinkText("Outside")).click();					
	        System.out.println(driver.getTitle());					
	        driver.quit();					
	}

}
