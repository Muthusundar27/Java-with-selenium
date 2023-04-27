package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Switching_between_frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    // Instantiate a ChromeDriver class.  
        WebDriver driver = new ChromeDriver(options);
 /*    driver.navigate().to("http://demo.guru99.com/selenium/deprecated.html");
	    //Maximize the browser      
	    driver.manage().window().maximize(); 
	    driver.switchTo().frame("classFrame");
	    driver.findElement(By.linkText("Deprecated")).click();
	    driver.close();*/
	    
	    String alertMessage = "";

        driver.get("http://jsbin.com/usidix/1");
        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        
        System.out.println(alertMessage);
        
        driver.close();
        
	}

}
