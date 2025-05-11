package test.java;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import main.java.resources.DriverFactory;
import main.java.resources.HomePage;

public class Run {
	
		// TODO Auto-generated method stub
		DriverFactory factory = new DriverFactory();
		WebDriver driver = factory.createDriver();
		@BeforeMethod
		public void TestCase1() throws InterruptedException {          
		HomePage HomePage = new HomePage(driver);
		HomePage.Home(null);
		}
		@Test
		public void TestCase2() throws InterruptedException, IOException {
		Login Login = new Login(driver);
		Login.LogInnSignup();
		}
		@Test
		public void TestCase3() throws InterruptedException {
		BookFlight BookFlight = new BookFlight(driver);
		BookFlight.Flight();
		}
		@Test
		public void TestCase4() throws InterruptedException, IOException {
		GroupBooking Gbookings = new GroupBooking(driver);
		Gbookings.groupbookings();}
	
}
