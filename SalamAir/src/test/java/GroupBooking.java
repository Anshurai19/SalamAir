package test.java;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import main.java.resources.DriverFactory;
import main.java.resources.HomePage;

public class GroupBooking {

	 WebDriver driver;
	    // Constructor that receives WebDriver from DriverFactory
	    public  GroupBooking(WebDriver driver)
	    {
	        this.driver = driver;
	    }

	    @SuppressWarnings("deprecation")
		public  void groupbookings() throws InterruptedException, IOException
	    {
	    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    	HomePage HomePage = new HomePage(driver);
	    	DriverFactory data = new DriverFactory();
	    	//HomePage.Home();
	    	driver.findElement(By.xpath("//a[normalize-space()='CONTACT US']")).click();
	    	driver.findElement(By.cssSelector("li[class='item-529']")).click();
	    	ArrayList<String> G =data.getData("Group Name");
	    	driver.findElement(By.cssSelector("input[id='g_name']")).sendKeys(G.get(1));
	    	ArrayList<String> F =data.getData("First Name");
	    	driver.findElement(By.cssSelector("input[id='first_name']")).sendKeys(F.get(0));
	    	ArrayList<String> L =data.getData("Last Name");
	    	driver.findElement(By.cssSelector("input[id='last_name']")).sendKeys(L.get(1));
	    	ArrayList<String> E =data.getData("Name");
	    	driver.findElement(By.cssSelector("input[id='email']")).sendKeys(E.get(1));
	    	ArrayList<String> C =data.getData("Contact");
	    	driver.findElement(By.cssSelector("input[id='contact_phone']")).sendKeys(C.get(1));
	    	ArrayList<String> A =data.getData("Number Of Adults");
	    	driver.findElement(By.cssSelector("input[id='number_of_adults']")).sendKeys(A.get(1));
	    	ArrayList<String> Ch =data.getData("Number Of Childs");
	    	driver.findElement(By.cssSelector("input[id='number_of_childs']")).sendKeys(Ch.get(1));
	    	ArrayList<String> Co =data.getData("Contact");
	    	driver.findElement(By.cssSelector("input[id='number_of_infants']")).sendKeys(Co.get(1));
	    	ArrayList<String> Or =data.getData("Origin");
	    	driver.findElement(By.cssSelector("input[id='Origin']")).sendKeys(Or.get(1));
	    	ArrayList<String> De =data.getData("Destination");
	    	driver.findElement(By.cssSelector("input[id='destination']")).sendKeys(De.get(1));
	    	ArrayList<String> DD =data.getData("Departure Date");
	    	driver.findElement(By.cssSelector("input[id='departure_date']")).sendKeys(DD.get(1));
	    	ArrayList<String> RD =data.getData("Return Date");
	    	driver.findElement(By.cssSelector("input[id='return_date']")).sendKeys(RD.get(1));
	    	ArrayList<String> Ai =data.getData("Additional Information");
	    	driver.findElement(By.cssSelector("textarea[id='additional_information']")).sendKeys(Ai.get(1));
	    	//driver.quit();
	    }
}
