package lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigate_tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    // Instantiate a ChromeDriver class.  
	    WebDriver driver = new ChromeDriver(options);
	    driver.navigate().to("https://www.tnstc.in/home.html");
	    //Maximize the browser      
	    driver.manage().window().maximize(); 
//	    driver.navigate().refresh()

//	    driver.navigate().back();
	    
//	    driver.navigate().forward()
	}

}
