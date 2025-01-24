import org.openqa.selenium.WebDriver;


public class HomePage 
{
	

	    WebDriver driver;

	    // Constructor that receives WebDriver from DriverFactory
	    public HomePage(WebDriver driver)
	    {
	        this.driver = driver;
	    }
	
	public void Home() throws InterruptedException 
	{
		driver.get("https://www.salamair.com/en/");
	}
	
	
}
