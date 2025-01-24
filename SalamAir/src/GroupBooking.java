import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupBooking {

	 WebDriver driver;

	    // Constructor that receives WebDriver from DriverFactory
	    public  GroupBooking(WebDriver driver)
	    {
	        this.driver = driver;
	    }

	    @SuppressWarnings("deprecation")
		public  void groupbookings() throws InterruptedException
	    {
	    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    	HomePage HomePage = new HomePage(driver);
			HomePage.Home();
	    	driver.findElement(By.xpath("//a[normalize-space()='CONTACT US']")).click();
	    	driver.findElement(By.cssSelector("li[class='item-529'")).click();
	    	driver.findElement(By.cssSelector("input[id='g_name'")).sendKeys("Test");
	    	driver.findElement(By.cssSelector("input[id='first_name'")).sendKeys("Anshu");
	    	driver.findElement(By.cssSelector("input[id='last_name'")).sendKeys("Rai");
	    	driver.findElement(By.cssSelector("input[id='email'")).sendKeys("Test@test.com");
	    	driver.findElement(By.cssSelector("input[id='contact_phone'")).sendKeys("1234567899");
	    	driver.findElement(By.cssSelector("input[id='number_of_adults'")).sendKeys("19");
	    	driver.findElement(By.cssSelector("input[id='number_of_childs'")).sendKeys("9");
	    	driver.findElement(By.cssSelector("input[id='number_of_infants'")).sendKeys("2");
	    	driver.findElement(By.cssSelector("input[id='Origin'")).sendKeys("India");
	    	driver.findElement(By.cssSelector("input[id='destination'")).sendKeys("Oman");
	    	driver.findElement(By.cssSelector("input[id='departure_date'")).sendKeys("19/06/2025");
	    	driver.findElement(By.cssSelector("input[id='return_date'")).sendKeys("30/06/2025");
	    	driver.findElement(By.cssSelector("textarea[id='additional_information'")).sendKeys("Testing");
	    	driver.quit();
	    }
}
