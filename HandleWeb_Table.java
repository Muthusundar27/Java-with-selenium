package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleWeb_Table {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	    // Instantiate a ChromeDriver class.  
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        
        String baseURL = "http://demo.guru99.com/test/newtours/";
        driver.get(baseURL);
        Thread.sleep(2000);
        String innerText = driver.findElement(By.xpath("//table[@width=\"270\"]/tbody/tr[4]/td")).getText(); 		
        	System.out.println(innerText); 
        	driver.quit();
	}

}
