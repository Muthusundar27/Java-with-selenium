package Demo.FirstTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Solve {
@Test

public void login() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    Thread.sleep(2000);
    driver.get("https://petstore.octoperf.com/actions/Account.action");
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
   WebElement usr = driver.findElement(By.xpath("//input[@name='username']"));
   usr.sendKeys("j2ee");
   usr.click();
   Thread.sleep(4000);
   driver.findElement(By.xpath("//input[@value='Login']")).click();
   
    
}
}
;