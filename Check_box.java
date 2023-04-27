package lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Check_box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    // Instantiate a ChromeDriver class.  
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        String base_URL = "https://demo.guru99.com/test/radio.html";
        driver.get(base_URL);
        WebElement chkbox = driver.findElement(By.id("vfb-6-0"));
        for(int i=0; i<2; i++) {
        	chkbox.click();
        	System.out.println(chkbox.isSelected());
        }
        driver.quit();
	}

}
