package Demo.FirstTestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orange_HRM01 {
	 WebElement dropdown1, dropdown2, dropdown3, element,dropdown4;
	 String dyanm;
	@Test
	
	public void user_01() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("orangehrm", Keys.ENTER);
//        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;  
        js.executeScript("window.scrollBy(0,200)");
        driver.findElement(By.xpath("//a[@href='https://opensource-demo.orangehrmlive.com/']")).click();
        Thread.sleep(2000);
        
//        Loginpage;
        
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123", Keys.ENTER);    
        driver.findElement(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']")).click();
//  USER 1:
//      Dashboardpage;
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();

 //     Admin / User Management page;
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")).click();
        Thread.sleep(4000);
        
//       Admin
		 dropdown1 = driver.findElement(By.xpath("//div[@class='oxd-select-option'][2]"));
		 dropdown1.click();
		 dropdown2 = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]"));
		 dropdown2.click();
		 dropdown3 = driver.findElement(By.xpath("//div[@class='oxd-select-option'][2]"));
		 dropdown3.click();
		 Thread.sleep(4000);
		 
//		 Username;
		 element = driver.findElement(By.className("oxd-userdropdown-name"));
		 dyanm = element.getText();
		 Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(dyanm);
	     Thread.sleep(4000);
		 dropdown4 =  driver.findElement(By.cssSelector("div.oxd-autocomplete-option"));
		 dropdown4.click();

         driver.findElement(By.xpath("//label[text()='Username']/following::input[1]")).sendKeys("Sundar");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//label[text()='Username']/following::input[2]")).sendKeys("#ABcd1234");
         driver.findElement(By.xpath("//label[text()='Username']/following::input[3]")).sendKeys("#ABcd1234");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//button[@type='submit']")).click();
         Thread.sleep(2000);
                 

    //  USER 2:
//    Dashboardpage;
      driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
//    Admin / User Management page;
      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")).click();
      Thread.sleep(4000);
   
//    Admin
		 dropdown1 = driver.findElement(By.xpath("//div[@class='oxd-select-option'][3]"));
		 dropdown1.click();
         dropdown2 = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]"));
		 dropdown2.click();
		 dropdown3 = driver.findElement(By.xpath("//div[@class='oxd-select-option'][2]"));
		 dropdown3.click();
		 Thread.sleep(2000);    
    
//		 Username;
		 element = driver.findElement(By.className("oxd-userdropdown-name"));
		 dyanm = element.getText();
		 Thread.sleep(2000);
	     driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(dyanm);
	     Thread.sleep(4000);
		 dropdown4 =  driver.findElement(By.cssSelector("div.oxd-autocomplete-option"));
		 dropdown4.click();

         driver.findElement(By.xpath("//label[text()='Username']/following::input[1]")).sendKeys("Muthu");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//label[text()='Username']/following::input[2]")).sendKeys("#ABcd1234");
         driver.findElement(By.xpath("//label[text()='Username']/following::input[3]")).sendKeys("#ABcd1234");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//button[@type='submit']")).click();
    
    
         //  USER 3:
//       Dashboardpage;
         driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
//       Admin / User Management page;
         driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")).click();
         Thread.sleep(4000);
      
//       Admin
   		 dropdown1 = driver.findElement(By.xpath("//div[@class='oxd-select-option'][3]"));
   		 dropdown1.click();
            dropdown2 = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]"));
   		 dropdown2.click();
   		 dropdown3 = driver.findElement(By.xpath("//div[@class='oxd-select-option'][2]"));
   		 dropdown3.click();
   		 Thread.sleep(2000);    
       
//   		 Username;
   		 element = driver.findElement(By.className("oxd-userdropdown-name"));
   		 dyanm = element.getText();
   		 Thread.sleep(2000);
   	     driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(dyanm);
   	     Thread.sleep(4000);
   		 dropdown4 =  driver.findElement(By.cssSelector("div.oxd-autocomplete-option"));
   		 dropdown4.click();

            driver.findElement(By.xpath("//label[text()='Username']/following::input[1]")).sendKeys("Subha");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//label[text()='Username']/following::input[2]")).sendKeys("#ABcd1234");
            driver.findElement(By.xpath("//label[text()='Username']/following::input[3]")).sendKeys("#ABcd1234");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            
            
//            Delete the User
            JavascriptExecutor j = (JavascriptExecutor) driver;  
            j.executeScript("window.scrollBy(0,200)");
    
	}
}
