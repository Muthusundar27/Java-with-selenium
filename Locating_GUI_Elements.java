package lib;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locating_GUI_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--remote-allow-origins=*");
	    // Instantiate a ChromeDriver class.  
	    WebDriver driver = new ChromeDriver(options);
	    String baseURl = "https://www.tnstc.in/home.html";
//	    String tagname = "";
	    //Maximize the browser      
	    driver.manage().window().maximize();  
	    
	    driver.get(baseURl);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    WebElement buttonname = driver.findElement(By.xpath("//div[@class='btnTxt']"));
  //using getText method the retrieve the text of the element

    System.out.println(buttonname.getText());
//	    System.out.println(tagname);
        driver.close();
   
	}

}
