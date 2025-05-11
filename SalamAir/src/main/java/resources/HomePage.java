package main.java.resources;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;



public class HomePage 
{
	

	    WebDriver driver;

	    // Constructor that receives WebDriver from DriverFactory
	    public HomePage(WebDriver driver)
	    {
	        this.driver = driver;
	    }
	    	
	  
	public void Home(String URLname) throws InterruptedException 
	{
		driver.get("https://www.salamair.com/en/");
	}
	
	
}
