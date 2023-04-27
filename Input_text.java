package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Input_text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    // Instantiate a ChromeDriver class.  
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/login.html");
        WebElement email = driver.findElement(By.id("email"));
        WebElement passwrd = driver.findElement(By.name("passwd"));  	
        email.sendKeys("suba@gmail.com");
        passwrd.sendKeys("12345678");
        email.clear();
        passwrd.clear();
        WebElement login = driver.findElement(By.id("SubmitLogin"));
        login.click();
        System.out.println("Login Done with Click");					
		
        //using submit method to submit the form. Submit used on password field		
        driver.get("https://demo.guru99.com/test/login.html");					
        driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");							
        driver.findElement(By.name("passwd")).sendKeys("abcdefghlkjl");							
        driver.findElement(By.id("SubmitLogin")).submit();					
        System.out.println("Login Done with Submit");
        
	}

}
