import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BookFlight {
	
	WebDriver driver;

    // Constructor that receives WebDriver from DriverFactory
    public BookFlight(WebDriver driver)
    {
        this.driver = driver;
    }
    
    @SuppressWarnings("deprecation")
	public void Flight() throws InterruptedException {
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    HomePage HomePage = new HomePage(driver);
	HomePage.Home();
    driver.findElement(By.xpath("//a[normalize-space()='BOOK A FLIGHT']")).click();
    String myWindowHandle = driver.getWindowHandle();
    driver.switchTo().window(myWindowHandle);
    Thread.sleep(1000);
    driver.findElement(By.xpath("//label[normalize-space()='One Way']")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("txtOriginFull")).click();
    driver.findElement(By.cssSelector("div[class='select-dropdown datepicker'] li[value='BLR']")).click();
    driver.findElement(By.cssSelector("div[class='select-dropdown destinationpicker'] li[value='BGW']")).click();
    driver.findElement(By.xpath("(//span[contains(text(),'29')])[2]")).click();
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("div[class='col col-12 col-lg-6 d-block hidden'] input[value='Search']")).click();
    Thread.sleep(2000);
	
	
	
	
    }
}
    
