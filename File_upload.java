package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class File_upload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	    // Instantiate a ChromeDriver class.  
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        
        String baseURL = "https://demo.guru99.com/test/upload/";
        driver.get(baseURL);
        Thread.sleep(2000);
       WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
       // enter the file path onto the file-selection input field
       uploadElement.sendKeys("C:\\Users\\a851335\\OneDrive - Atos\\New folder"); 
       
       // check the "I accept the terms of service" check box
       driver.findElement(By.id("terms")).click();
       
       // click the "UploadFile" button
       driver.findElement(By.id("submitbutton")).click();
       
        
	}

}
