import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Login 
{
	 WebDriver driver;

	    // Constructor that receives WebDriver from DriverFactory
	    public  Login(WebDriver driver)
	    {
	        this.driver = driver;
	    }

	    @SuppressWarnings("deprecation")
		public  void LogInnSignup() throws InterruptedException, IOException
	    {
		
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    HomePage HomePage = new HomePage(driver);
	   
		HomePage.Home();
		driver.findElement(By.className("btn-login")).click();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String>it = windows.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		 DriverFactory data = new DriverFactory();
		ArrayList<String> EM  =data.getData("email id");
		driver.findElement(By.cssSelector("input[placeholder='Email *'")).sendKeys(EM.get(1));
		ArrayList<String> PS  =data.getData("Password");
		driver.findElement(By.cssSelector("input[placeholder='Password *'")).sendKeys(PS.get(1));
		driver.findElement(By.cssSelector("button[type='submit'")).click();
			
		

	}

}
